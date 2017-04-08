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
	public void testSendEmailTo() {
		data.data1();
		fail("Not yet implemented");
	}

	@Test
	public void testSendSMSTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testAllocateCourier() {
		fail("Not yet implemented");
	}

}
