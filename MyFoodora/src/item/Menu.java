package item;

import java.util.ArrayList;


/**
 * @author Dingo
 * The menu of a restaurant
 */
public class Menu {

	ArrayList<Item> items;
	ArrayList<Meal> fullMeals;
	ArrayList<Meal> halfMeals;
	
	public Menu() {
		items = new ArrayList<Item>();
		fullMeals = new ArrayList<Meal>();
		halfMeals = new ArrayList<Meal>();
	}

	public void addItem(Item item){
		if(!(items.contains(item)))
			items.add(item);
	}
	
	public void removeItem(Item item){
		if(items.contains(item))
			items.remove(item);
	}
	
	public void addMeal(Meal meal){
		if(meal.getType()=="fullMeal")
			fullMeals.add(meal);
		else
			halfMeals.add(meal);
	}
	
	public void removeMeal(Meal meal){
		if(meal.getType()=="fullMeal")
			fullMeals.remove(meal);
		else
			halfMeals.remove(meal);
	}
}
