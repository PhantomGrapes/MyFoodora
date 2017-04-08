package item;

import static org.junit.Assert.*;


import org.junit.Test;

import exception.NumberOutOfRangeException;

public class BasicPlanTest {

	@Test
	public void testVisitItem() throws NumberOutOfRangeException {
		Item item = new Item("pizza", "Main-dish", "standard", 10);
		BasicPlan card = new BasicPlan();
		assertTrue(card.visit(item)==10);
	}

	@Test
	public void testVisitMealWithNormalPrice() throws NumberOutOfRangeException {
		Meal meal = new Meal("BurgerKing", "fullMeal", "vegetarian");
		Item i1 = new Item("fromage", "Starter", "standard", 4);
		Item i2 = new Item("pizza", "Main-dish", "standard", 10);
		Item i3 = new Item("cake", "Dessert", "standard", 5);
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		BasicPlan card = new BasicPlan();
		assertTrue(card.visit(meal)==19);
	}
	
	@Test(expected=NumberOutOfRangeException.class)
	public void testVisitMealWithBigPrice() throws NumberOutOfRangeException {
		Meal meal = new Meal("BurgerKing", "fullMeal", "vegetarian");
		Item i1 = new Item("fromage", "Starter", "standard", Math.pow(10, 308) );
		Item i2 = new Item("pizza", "Main-dish", "standard", Math.pow(10, 308));
		Item i3 = new Item("cake", "Dessert", "standard", Math.pow(10, 308));
		meal.addToMealComposer(i1);
		meal.addToMealComposer(i2);
		meal.addToMealComposer(i3);
		BasicPlan card = new BasicPlan();
	}

	@Test
	public void testCalculateFinalPrice() {
		fail("Not yet implemented");
	}

}
