package myFoodora;

import java.util.ArrayList;

public class Courier extends User{

	private String surname;
	private String phoneNumber;
	
	private Coordinate address;
	
	private boolean onDuty;
	
	private ArrayList<Order> deliveredOrders = new ArrayList<Order>();
}
