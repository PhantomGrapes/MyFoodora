package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Meal;

public class MealTest {

	@Test(expected=Exception.class)
	public void testSetType() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		Meal m = new Meal("burger king", "fefre", "Standard");
	}

	@Test(expected=Exception.class)
	public void testSetPreference() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		Meal m = new Meal("burger king", "Main-dish", "fdsfdsf");
	}

	@Test
	public void testCalculateNormalMealPrice() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		data.meal.calculatePrice();
		assertTrue(data.meal.getPrice()==19*(1-data.r.getGeneiclDiscountFactor()));
	}

	@Test
	public void testCalculateSpecialMealPrice() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		data.meal.setSpecialOffer(true);
		data.meal.calculatePrice();
		assertTrue(data.meal.getPrice()==19*(1-data.r.getSpecialDiscountFactor()));
	}
	
	@Test(expected=Exception.class)
	public void testAdd2DessertsToMealComposer() throws Exception{
		TestUseData data = new TestUseData();
		data.data1();
		data.meal.removeItemFromComposer(data.i2);
		data.meal.addToMealComposer(data.i1);
	}
	
	@Test(expected=Exception.class)
	public void testAdd4ItemsToMealComposer() throws Exception{
		TestUseData data = new TestUseData();
		data.data1();
		data.meal.addToMealComposer(data.i1);
	}
}
