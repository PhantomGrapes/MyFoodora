package test;

import exception.NumberOutOfRangeException;
import item.BasicPlan;
import item.Item;
import item.Meal;
import item.Menu;
import user.Customer;
import user.Restaurant;
import utilites.Coordinate;

public class TestUseData {
	public Item i1,i2,i3;
	public Meal meal;
	public Restaurant r;
	public Menu m;
	public Customer c;
	public BasicPlan card;
	
	public void data1() throws Exception{
		
		i1 = new Item("fromage", "Starter", "Standard", 4);
		i2 = new Item("pizza", "Main-dish", "Standard", 10);
		i3 = new Item("cake", "Dessert", "Standard", 5);
		meal = new Meal("BurgerKing", "fullMeal", "Vegetarian");
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		
		r = new Restaurant("HappyHour", new Coordinate(2, 3), "r1", "1234567");
		m = new Menu();
		m.addItem(i1);
		m.addItem(i2);
		m.addItem(i3);
		m.setRestaurant(r);
		r.setMenu(m);
		meal.setMenu(m);
		
		c = new Customer("Potter", "Harry", "HP123", new Coordinate(10, 10), "1234567");
		card = new BasicPlan();
		c.registerFidelityPlan(card);
	}
}
