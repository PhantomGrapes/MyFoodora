package myFoodora;

import java.util.ArrayList;

public class Customer extends User{
	
	private String surname;
	private String email;
	private String phoneNumber;
	
	private Coordinate address;
	
	private boolean canBeNotified;
	private boolean isNotifiedByEmail;
	
	private FidelityPlan fidelityPlan;
	
	private Order currentOrder;
	private ArrayList<Order> historyOrders = new ArrayList<Order>();
	
	
	
}
