package myFoodora;

import java.util.ArrayList;

public class Order {
	
	private Customer customer;
	private Courier courier;
	private Restaurant restaurant;
	
	private ArrayList<Item> itemList = new ArrayList<Item>();
	private ArrayList<Meal> mealList = new ArrayList<Meal>();
	
	private double finalPrice;
	
	private int date;
}
