package myFoodora;

import java.util.ArrayList;

public class Restaurant extends User{

	private Coordinate address;
	
	private SortPolicy sortPolicy;
	
	private Menu menu;
	
	private double geneiclDiscountFactor;
	private double specialDiscountFactor;
	
	private ArrayList<Order> orders = new ArrayList<Order>();
}
