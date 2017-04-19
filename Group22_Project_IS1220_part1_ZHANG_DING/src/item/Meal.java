package item;

import java.util.ArrayList;


/**
 * @author Shoulong
 * Meal item of a menu of restaurant.
 */

public class Meal implements Offer {

	private String name;
	private String type;
	private String preference;
	
	private Menu menu;
	// new add
	int soldNumber;
	
	private double price;
	
	private boolean isSpecialOffer;
	
	private ArrayList<Item> mealComposer = new ArrayList<Item>();
	
	public Meal(String name, String type, String preference) {
		super();
		this.name = name;
		setType(type);
		setPreference(preference);
		this.price = 0;
		this.menu = new Menu();
		this.soldNumber = 0;
		this.isSpecialOffer = false;
		this.mealComposer = new ArrayList<Item>();
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void setMealComposer(ArrayList<Item> mealComposer) {
		this.mealComposer = mealComposer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//new add
	public int getSoldNumber(){
		return soldNumber;
	}
	
	// new add
	public void setSoldNumber(int n){
		soldNumber = n;
	}
	
	public double getPrice() {
		calculatePrice();
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type)throws IllegalArgumentException {
		if(type == "halfMeal" || type == "fullMeal")
			this.type = type;
		else
			throw new IllegalArgumentException("Your input of Type is not correct.Please re-input.\n");
	}
	
	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference)throws IllegalArgumentException{
		if(preference == "Standard" || preference == "Vegetarian" || preference == "Gluten-free")
			this.preference = preference;
		else
			throw new IllegalArgumentException("Your input of Preference is not correct.Please re-input.\n");
	}
	
	public boolean isSpecialOffer() {
		return isSpecialOffer;
	}

	public void setSpecialOffer(boolean isSpecialOffer) {
		this.isSpecialOffer = isSpecialOffer;
		calculatePrice();
	}

	public ArrayList<Item> getMealComposer() {
		return mealComposer;
	}
// new add
	public void removeItemFromComposer(Item item){
		if(mealComposer.contains(item))
			mealComposer.remove(item);
	}
	public void addToMealComposer(Item item)throws Exception {
		if(this.type == "halfMeal" && mealComposer.size() <= 1){
			if(mealComposer.size() == 1){
				if(mealComposer.get(0).getType() == "Main-dish")
					mealComposer.add(item);
				else if(mealComposer.get(0).getType() == "Starter" && item.getType() == "Main-dish")
					mealComposer.add(item);
				else if(mealComposer.get(0).getType() == "Dessert" && item.getType() == "Main-dish")
					mealComposer.add(item);
				else
					throw new Exception("The type of dish you want to add is not correct.\n");
			}
			else
				mealComposer.add(item);
		}
		else if(this.type == "halfMeal" && mealComposer.size() >= 2){
			throw new Exception("Can't add more dish to this meal.\n");
		}
		
		else if(this.type == "fullMeal" && mealComposer.size() <=2){
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
					throw new Exception("The type of dish you want to add is not correct.\n");
			}
		}
		else if(this.type == "fullMeal" && mealComposer.size() >=3){
			throw new Exception("Can't add more dish to this meal.\n");
		}
		
		calculatePrice();
	}

	public void calculatePrice(){
		double gdf = this.getMenu().getRestaurant().getGeneiclDiscountFactor();
		double sdf = this.getMenu().getRestaurant().getSpecialDiscountFactor();
		
		if(this.isSpecialOffer){
			price = 0;
			for(Item i:mealComposer){
				price = price + i.getPrice();
			}
			price = price * (1-sdf);
		}else{
			price = 0;
			for(Item i:mealComposer){
				price = price + i.getPrice();
			}
			price = price * (1-gdf);
		}
	}
// calculate price of the meal of order.
	public double accept(FidelityPlan fidelityPlan){
		return fidelityPlan.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((preference == null) ? 0 : preference.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meal other = (Meal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (preference == null) {
			if (other.preference != null)
				return false;
		} else if (!preference.equals(other.preference))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
