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
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<Manager> managers = new ArrayList<Manager>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
		ArrayList<Courier> couriers = new ArrayList<Courier>();
		
		MyFoodora myFoodora = new MyFoodora();
		User user1 = new Customer();
		User user2 = new Restaurant();
		User user3 = new Manager();
		User user4 = new Courier();	

		myFoodora.addUser(user1);
		myFoodora.addUser(user2);
		myFoodora.addUser(user3);
		myFoodora.addUser(user4);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		managers.add((Manager) user3);
		customers.add((Customer) user1);
		restaurants.add((Restaurant) user2);
		couriers.add((Courier) user4);
		
		assertEquals(myFoodora.getCouriers().get(0), couriers.get(0));

		
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
