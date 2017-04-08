package test;

import static org.junit.Assert.*;


import org.junit.Test;

import exception.NumberOutOfRangeException;
import item.BasicPlan;
import item.Item;
import item.Meal;
import item.Menu;
import user.Customer;
import user.Restaurant;
import utilites.Coordinate;

public class BasicPlanTest {

	@Test
	public void testVisitItem() throws NumberOutOfRangeException {
		Item item = new Item("pizza", "Main-dish", "Standard", 10);
		BasicPlan card = new BasicPlan();
		assertTrue(card.visit(item)==10);
	}

	@Test
	public void testVisitMealWithNormalPrice() throws Exception {
		Meal meal = new Meal("BurgerKing", "fullMeal", "Vegetarian");
		Item i1 = new Item("fromage", "Starter", "Standard", 4);
		Item i2 = new Item("pizza", "Main-dish", "Standard", 10);
		Item i3 = new Item("cake", "Dessert", "Standard", 5);
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		BasicPlan card = new BasicPlan();
		assertTrue(card.visit(meal)==19);
	}
	
	@Test(expected=NumberOutOfRangeException.class)
	public void testVisitMealWithBigPrice() throws Exception {
		Meal meal = new Meal("BurgerKing", "fullMeal", "Vegetarian");
		Item i1 = new Item("fromage", "Starter", "Standard", Math.pow(10, 308) );
		Item i2 = new Item("pizza", "Main-dish", "Standard", Math.pow(10, 308));
		Item i3 = new Item("cake", "Dessert", "Standard", Math.pow(10, 308));
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		BasicPlan card = new BasicPlan();
		card.visit(meal);
	}

	@Test
	public void testCalculateFinalPriceALaCart() throws Exception {
		Item i1 = new Item("fromage", "Starter", "Standard", 4);
		Item i2 = new Item("pizza", "Main-dish", "Standard", 10);
		Item i3 = new Item("cake", "Dessert", "Standard", 5);
		Meal meal = new Meal("BurgerKing", "fullMeal", "Vegetarian");
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		Restaurant r = new Restaurant("HappyHour", new Coordinate(2, 3), "r1", "1234567");
		Menu m = new Menu();
		m.addItem(i1);
		m.addItem(i2);
		m.addItem(i3);
		r.setMenu(m);
		Customer c = new Customer("Potter", "Harry", "HP123", new Coordinate(10, 10), "1234567");
		BasicPlan card = new BasicPlan();
		c.registerFidelityPlan(card);
		c.creatOrder(r);
		c.addToOrder(i1, 1);
		c.addToOrder(i2, 1);
		c.addToOrder(i3, 1);
		assertTrue(card.calculateFinalPrice(c.getCurrentOrder())==19);
	}

}
