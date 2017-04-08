package item;

import java.util.ArrayList;

import user.Restaurant;


/**
 * @author Dingo
 * The menu of a restaurant
 */
public class Menu {

	ArrayList<Item> items;
	ArrayList<Meal> fullMeals;
	ArrayList<Meal> halfMeals;
	private Restaurant restaurant;

// getter and setter
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Meal> getFullMeals() {
		return fullMeals;
	}

	public void setFullMeals(ArrayList<Meal> fullMeals) {
		this.fullMeals = fullMeals;
	}

	public ArrayList<Meal> getHalfMeals() {
		return halfMeals;
	}

	public void setHalfMeals(ArrayList<Meal> halfMeals) {
		this.halfMeals = halfMeals;
	}
	
	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

// Constructor
	public Menu() {
		items = new ArrayList<Item>();
		fullMeals = new ArrayList<Meal>();
		halfMeals = new ArrayList<Meal>();
		restaurant = new Restaurant();
	}
	
	public Menu(Restaurant _restaurant){
		items = new ArrayList<Item>();
		fullMeals = new ArrayList<Meal>();
		halfMeals = new ArrayList<Meal>();
		restaurant = _restaurant;
	}

// functions
	public void addItem(Item item){
		if(!(items.contains(item))){
			items.add(item);
			item.setMenu(this);
		}
	}
	
	public void removeItem(Item item){
		if(items.contains(item))
			items.remove(item);
	}
	
	public void addMeal(Meal meal){
		if(meal.getType()=="fullMeal"){
			fullMeals.add(meal);
			meal.setMenu(this);
		}
		else{
			halfMeals.add(meal);
			meal.setMenu(this);
		}
	}
	
	public void removeMeal(Meal meal){
		if(meal.getType()=="fullMeal")
			fullMeals.remove(meal);
		else
			halfMeals.remove(meal);
	}
}
