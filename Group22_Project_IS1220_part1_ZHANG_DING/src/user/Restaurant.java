package user;

import java.util.ArrayList;

import item.Menu;
import item.Order;
import policy.SortHalfMeal;
import policy.SortPolicy;
import utilites.Coordinate;

/**
 * @author Shoulong
 * Restaurant of MyFoodora.
 */

public class Restaurant extends User{

	private Coordinate address;
	
	private SortPolicy sortPolicy;
	
	private Menu menu;
	
	private double genericDiscountFactor;
	private double specialDiscountFactor;
	
	private ArrayList<Order> orders = new ArrayList<Order>();

// new add constructor
	public Restaurant(){}
	
	public Restaurant(String _name, Coordinate _address, String _username, String _password) {
		super(_name, _username, _password);
		this.address = _address;
		this.sortPolicy = new SortHalfMeal();
		this.menu = new Menu();
		this.menu.setRestaurant(this);
		this.genericDiscountFactor = 0.05;
		this.specialDiscountFactor = 0.1;
	}

// getter and setter
	
	public double getGeneiclDiscountFactor() {
		return genericDiscountFactor;
	}

	public SortPolicy getSortPolicy() {
		return sortPolicy;
	}

	public void setSortPolicy(SortPolicy sortPolicy) {
		this.sortPolicy = sortPolicy;
	}

	public Coordinate getAddress() {
		return address;
	}

	public void setAddress(Coordinate address) {
		this.address = address;
	}

	public void setGeneiclDiscountFactor(double geneiclDiscountFactor) {
		this.genericDiscountFactor = geneiclDiscountFactor;
	}

	public double getSpecialDiscountFactor() {
		return specialDiscountFactor;
	}

	public void setSpecialDiscountFactor(double specialDiscountFactor) {
		this.specialDiscountFactor = specialDiscountFactor;
	}
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	// new add
	public void addOrder(Order order){
		orders.add(order);
	}
	
	
}
