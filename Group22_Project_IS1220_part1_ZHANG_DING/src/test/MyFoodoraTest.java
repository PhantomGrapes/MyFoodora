package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import myFoodora.MyFoodora;
import user.Courier;
import user.Customer;
import user.Manager;
import user.Restaurant;
import user.User;
import utilites.Coordinate;

public class MyFoodoraTest {
	MyFoodora myFoodora = new MyFoodora();
	User user1 = new Customer();
	User user2 = new Restaurant();
	User user3 = new Manager();
	User user4 = new Courier();	
	
	TestUseData data = new TestUseData();
	
	@Test
	public void testAddUser() {
		myFoodora.addUser(user1);
		myFoodora.addUser(user2);
		myFoodora.addUser(user3);
		myFoodora.addUser(user4);
		
		assertTrue(myFoodora.getRestaurants().get(0) == user2);	
	}

	@Test
	public void testRemoveUser() {
		myFoodora.addUser(user1);
		myFoodora.addUser(user2);
		myFoodora.addUser(user3);
		myFoodora.addUser(user4);
		
		myFoodora.removeUser(user2);
		
		assertTrue(myFoodora.getRestaurants().size()==0);	
	}

	@Test
	public void testSendEmailTo() throws Exception {
		data.data1();
		myFoodora.sendEmailTo(data.c, "Hello");
	}

	@Test
	public void testSendSMSTo() throws Exception {
		data.data1();
		myFoodora.sendSMSTo(data.c, "Hello");
	}

	@Test
	public void testNotifyUsers() throws Exception {
		data.data1();
		myFoodora.addUser(data.c);
		myFoodora.notifyUsers("haha");
	}

	@Test
	public void testAllocateCourier() throws Exception {
		data.data1();
		myFoodora.addUser(data.c);
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		Courier courier = new Courier();
		myFoodora.addUser(courier);
		myFoodora.allocateCourier(data.c.getCurrentOrder());
	}

}
