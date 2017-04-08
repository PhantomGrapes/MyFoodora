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

	@Test
	public void testAddUser() {
		MyFoodora myFoodora = new MyFoodora();
		User user1 = new Customer();
		User user2 = new Restaurant();
		User user3 = new Manager();
		User user4 = new Courier();	

		myFoodora.addUser(user1);
		myFoodora.addUser(user2);
		myFoodora.addUser(user3);
		myFoodora.addUser(user4);
		
		assertTrue(myFoodora.getUsers().get(0) == user1);	
	}

	@Test
	public void testRemoveUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendEmailTo() {
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
