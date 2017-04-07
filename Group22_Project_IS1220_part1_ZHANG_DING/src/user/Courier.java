package user;

import java.util.ArrayList;

import item.Order;
import utilites.Coordinate;

/**
 * @author Shoulong
 * Courier to delivering orders.
 */

public class Courier extends User{

	private String surname;
	private String phoneNumber;
	
	private Coordinate address;
	
	private boolean onDuty;
	
	private ArrayList<Order> deliveredOrders = new ArrayList<Order>();
	
// Constructor of Courier
	public Courier(String _name, String surname, String _username, Coordinate address, String _password) {
		super(_name, _username, _password);
		this.surname = surname;
		this.address = address;
		this.phoneNumber = "";
		this.onDuty = false;
		this.deliveredOrders = new ArrayList<Order>();
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
	
	public boolean isOnDuty(){
		return onDuty;
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
