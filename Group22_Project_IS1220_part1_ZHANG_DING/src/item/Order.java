package item;

import java.util.ArrayList;
import java.util.Calendar;
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
	
	private Calendar calendar;
	private Date date;
	
	String name;

	public Order(){
		this.customer = new Customer();
		this.courier = new Courier();
		this.restaurant = new Restaurant();
		this.itemList = new ArrayList<Item>();
		this.mealList = new ArrayList<Meal>();
		this.finalPrice = 0;
		this.calendar = Calendar.getInstance();
		this.date = (Date) calendar.getTime();
	}
// getter and setter
	public Customer getCustomer() {
		return customer;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
