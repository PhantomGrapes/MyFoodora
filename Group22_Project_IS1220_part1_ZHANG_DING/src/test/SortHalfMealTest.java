package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import item.Meal;
import item.Offer;
import item.Order;
import policy.SortHalfMeal;

public class SortHalfMealTest {
	
	@Test
	public void test() {
		SortHalfMeal shm = new SortHalfMeal();
		ArrayList<Offer> offers = new ArrayList<Offer>();
		ArrayList<Order> orders = new ArrayList<Order>();
		
		Order order1 = new Order();
		Order order2 = new Order();
		Meal meal1 = new Meal("lala","halfMeal","Standard");
		meal1.setType("halfMeal");
		Meal meal2 = new Meal("fa","halfMeal","Standard");
		meal2.setType("halfMeal");
		
		order1.addToMealList(meal1);
		order1.addToMealList(meal2);
		order2.addToMealList(meal1);
		
		orders.add(order1);
		orders.add(order2);
		
		assertTrue(shm.shippedOrderSort(orders).get(0) == meal1);
	}

}
