package user;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import item.Order;

/**
 * @author Shoulong
 * Managers of MyFoodora.
 */

public class Manager extends User{

	private String surname;
	
// new add Constructor of manager
	public Manager(){}
	
	public Manager(String _name, String surname, String _username, String _password) {
		super(_name, _username, _password);
		this.surname = surname;
	}
	
	public double getTotalIncome(Date startDate, Date endDate){
		double totalIncome, markup, serviceFee, deliveryCost;
		totalIncome = 0;
		markup = myFoodora.getMarkup();
		serviceFee = myFoodora.getServiceFee();
		deliveryCost = myFoodora.getDeliveryCost();
		for (Order order : myFoodora.getOrders()) {
			// if the date of order is between start date and end date, the income will be included
			if(startDate.compareTo(order.getDate()) <= 0 &&  order.getDate().compareTo(endDate) <= 0)
				totalIncome += order.getFinalPrice()*markup+serviceFee-deliveryCost;
		}
		return totalIncome;
	}

	public double getAverageIncome(Date startDate, Date endDate){
		double totalIncome, markup, serviceFee, deliveryCost;
		int num;
		num = 0;
		totalIncome = 0;
		markup = myFoodora.getMarkup();
		serviceFee = myFoodora.getServiceFee();
		deliveryCost = myFoodora.getDeliveryCost();
		for (Order order : myFoodora.getOrders()) {
			// if the date of order is between start date and end date, the income will be included
			if(startDate.compareTo(order.getDate()) <= 0 &&  order.getDate().compareTo(endDate) <= 0){
				totalIncome += order.getFinalPrice()*markup+serviceFee-deliveryCost;
				num++;
			}
		}
		return totalIncome/num;
	}
	
	public Restaurant getMostSellingRestaurant(){
		ArrayList<Restaurant> rs = new ArrayList<Restaurant>();
		rs = myFoodora.getRestaurants();
		Collections.sort(rs, new Comparator<Restaurant>() {
			@Override
			public int compare(Restaurant r1, Restaurant r2){
				return r2.getOrders().size() - r1.getOrders().size();
			}
		});
		return rs.get(0);
	}
	
	public Restaurant getLeastSellingRestaurant(){
		ArrayList<Restaurant> rs = new ArrayList<Restaurant>();
		rs = myFoodora.getRestaurants();
		Collections.sort(rs, new Comparator<Restaurant>() {
			@Override
			public int compare(Restaurant r1, Restaurant r2){
				return r1.getOrders().size() - r2.getOrders().size();
			}
		});
		return rs.get(0);
	}
	
	public Courier getMostActiveCourier(){
		ArrayList<Courier> cs = new ArrayList<Courier>();
		cs = myFoodora.getCouriers();
		Collections.sort(cs, new Comparator<Courier>() {
			@Override
			public int compare(Courier c1, Courier c2){
				return c2.counterOfDeliveredOrder() - c1.counterOfDeliveredOrder();
			}
		});
		return cs.get(0);
	}
	
	public Courier getLeastActiveCourier(){
		ArrayList<Courier> cs = new ArrayList<Courier>();
		cs = myFoodora.getCouriers();
		Collections.sort(cs, new Comparator<Courier>() {
			@Override
			public int compare(Courier c1, Courier c2){
				return c1.counterOfDeliveredOrder() - c2.counterOfDeliveredOrder();
			}
		});
		return cs.get(0);
	}
}
