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
	Item i1,i2,i3;
	Meal meal;
	Restaurant r;
	Menu m;
	Customer c;
	BasicPlan card;
	
	public void data1() throws NumberOutOfRangeException{
		i1 = new Item("fromage", "Starter", "standard", 4);
		i2 = new Item("pizza", "Main-dish", "standard", 10);
		i3 = new Item("cake", "Dessert", "standard", 5);
		meal = new Meal("BurgerKing", "fullMeal", "vegetarian");
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		r = new Restaurant("HappyHour", new Coordinate(2, 3), "r1", "1234567");
		m = new Menu();
		m.addItem(i1);
		m.addItem(i2);
		m.addItem(i3);
		r.setMenu(m);
		c = new Customer("Potter", "Harry", "HP123", new Coordinate(10, 10), "1234567");
		card = new BasicPlan();
		c.registerFidelityPlan(card);
	}
}