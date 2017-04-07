package user;

import java.util.ArrayList;

import item.Order;
import utilites.Coordinate;

public class Courier extends User{

	private String surname;
	private String phoneNumber;
	
	private Coordinate address;
	
	private boolean onDuty;
	
	private ArrayList<Order> deliveredOrders = new ArrayList<Order>();
	
// Constructor of Courier
	public Courier(){
		super();
	}

// new Address
	public void setAddress(Coordinate newAddress){
		address = newAddress;
	}
// new add	
	public Coordinate getAddress(){
		return address;
	}

// On or off duty
	public void setOnOrOffDuty(boolean isOnDuty){
		onDuty = isOnDuty;
	}

// accepter or refuse an order
	public void acceptTheOrder(Order order){
		order.setCourier(this);
		deliveredOrders.add(order);
	}
	
	public void refuseTheOrder(Order order){
		
	}

// counter of orders
	public int counterOfDeliveredOrder(){
		return deliveredOrders.size();
	}
	
}