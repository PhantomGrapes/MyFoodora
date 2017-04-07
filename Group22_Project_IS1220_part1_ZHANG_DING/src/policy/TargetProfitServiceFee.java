package policy;

import java.util.ArrayList;

import item.Order;
import myFoodora.MyFoodora;

public class TargetProfitServiceFee implements TargetProfitPolicy{
	@Override
	public double makeDescision(double target, double arg1, double arg2, MyFoodora myfoodora) {
		ArrayList<Order> orders = myfoodora.getOrders();
		double totalIncome = 0;
		double averageIncome, averageTarget;
		for (Order order : orders) {
			totalIncome += order.getFinalPrice();
		}
		averageIncome = totalIncome/orders.size();
		averageTarget = target/orders.size();
		return averageTarget-averageIncome*myfoodora.getMarkup()+myfoodora.getDeliveryCost();
	}
}
