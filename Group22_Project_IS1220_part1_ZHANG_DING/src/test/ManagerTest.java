package test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import item.Order;
import myFoodora.MyFoodora;
import user.Manager;

public class ManagerTest {
	
	MyFoodora myFoodora = new MyFoodora();
	Manager manager = new Manager("Happy","Newyear","QNMLGB","1234567",myFoodora);
	Calendar cal = Calendar.getInstance();
	Date date;

	@Test
	public void testGetTotalIncome() {
		myFoodora.addUser(manager);
		date = (Date) cal.getTime();
		
		Order order1 = new Order();
		Order order2 = new Order();
		
		order1.setFinalPrice(10);
		order2.setFinalPrice(12);
		
		myFoodora.getOrders().add(order1);
		myFoodora.getOrders().add(order2);
		
		manager.getTotalIncome(date, date);
		
	}

	@Test
	public void testGetAverageIncome() {
		myFoodora.addUser(manager);
		date = (Date) cal.getTime();
		
		Order order1 = new Order();
		Order order2 = new Order();
		
		order1.setFinalPrice(10);
		order2.setFinalPrice(12);
		
		myFoodora.getOrders().add(order1);
		myFoodora.getOrders().add(order2);
		
		manager.getAverageIncome(date, date);

	}

	@Test
	public void testGetMostSellingRestaurant() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeastSellingRestaurant() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMostActiveCourier() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLeastActiveCourier() {
		fail("Not yet implemented");
	}

}
