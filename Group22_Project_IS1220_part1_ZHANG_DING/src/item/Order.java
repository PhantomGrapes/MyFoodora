package item;

import java.util.ArrayList;
import java.util.Date;

import user.Courier;
import user.Customer;
import user.Restaurant;

/**
 * @author Shoulong
 * An order composed by item and meal. 
 */

public class Order {
	
	private Customer customer;
	private Courier courier;
	private Restaurant restaurant;
	
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private ArrayList<Meal> mealList = new ArrayList<Meal>();
	
	private double finalPrice;
	
	private Date date;

// getter and setter
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	public ArrayList<Meal> getMealList() {
		return mealList;
	}

	public void setMealList(ArrayList<Meal> mealList) {
		this.mealList = mealList;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

// add/remove item or meal to these 2 lists
	public void addToItemList(Item item){
		itemList.add(item);
	}
	
	public void addToMealList(Meal meal){
		mealList.add(meal);
	}

	public void removeFromItemList(Item item){
		itemList.remove(item);
	}
	
	public void removeFromMealList(Meal meal){
		mealList.remove(meal);
	}
	
}
