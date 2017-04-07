package user;

import java.util.ArrayList;

import item.Menu;
import item.Order;
import policy.SortPolicy;
import utilites.Coordinate;

public class Restaurant extends User{

	private Coordinate address;
	
	private SortPolicy sortPolicy;
	
	private Menu menu;
	
	private double geneiclDiscountFactor;
	private double specialDiscountFactor;
	
	private ArrayList<Order> orders = new ArrayList<Order>();

	public double getGeneiclDiscountFactor() {
		return geneiclDiscountFactor;
	}

	public void setGeneiclDiscountFactor(double geneiclDiscountFactor) {
		this.geneiclDiscountFactor = geneiclDiscountFactor;
	}

	public double getSpecialDiscountFactor() {
		return specialDiscountFactor;
	}

	public void setSpecialDiscountFactor(double specialDiscountFactor) {
		this.specialDiscountFactor = specialDiscountFactor;
	}
	
	// new add
	public void addOrder(Order order){
		orders.add(order);
	}
}