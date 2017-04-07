package item;

import java.util.ArrayList;

public class Meal implements Offer {

	private String name;
	private String type;
	private String preference;
	
	private boolean isSpecialOffer;
	
	private ArrayList<Item> mealComposer = new ArrayList<Item>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if(type == "Half-Meal" || type == "Full-Meal")
			this.type = type;
		else
			System.out.println("Your input of Type is not correct.Please re-input.\n");
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		if(preference == "Standard" || preference == "Vegetarian" || preference == "Gluten-free")
			this.preference = preference;
		else
			System.out.println("Your input of Preference is not correct.Please re-input.\n");
	}
	
	public boolean isSpecialOffer() {
		return isSpecialOffer;
	}

	public void setSpecialOffer(boolean isSpecialOffer) {
		this.isSpecialOffer = isSpecialOffer;
	}

	public ArrayList<Item> getMealComposer() {
		return mealComposer;
	}

	public void addToMealComposer(Item item) {
		if(this.type == "Half-Meal" && mealComposer.size() <= 1){
			if(mealComposer.size() == 1){
				if(mealComposer.get(0).getType() == "Main-dish")
					mealComposer.add(item);
				else if(mealComposer.get(0).getType() == "Starter" && item.getType() == "Main-dish")
					mealComposer.add(item);
				else if(mealComposer.get(0).getType() == "Dessert" && item.getType() == "Main-dish")
					mealComposer.add(item);
				else
					System.out.println("The type of dish you want to add is not correct.\n");
			}
			else
				mealComposer.add(item);
		}
		else if(this.type == "Half-Meal" && mealComposer.size() >= 2){
			System.out.println("Cant add more dish to this meal.\n");
		}
		
		else if(this.type == "Full-Meal" && mealComposer.size() <=2){
			if(mealComposer.size() == 0)
				mealComposer.add(item);
			else{
				boolean duplicate = false;
				for(Item i: mealComposer){
					if(i.getType() == item.getType())
						duplicate = true;
				}
				if(!duplicate)
					mealComposer.add(item);
				else
					System.out.println("The type of dish you want to add is not correct.\n");
			}
		}
		else if(this.type == "Full-Meal" && mealComposer.size() >=3){
			System.out.println("Cant add more dish to this meal.\n");
		}
	}

// calculate price of the meal of order.
	public double accept(FidelityPlan fidelityPlan){
		return fidelityPlan.visit(this);
	}
}
