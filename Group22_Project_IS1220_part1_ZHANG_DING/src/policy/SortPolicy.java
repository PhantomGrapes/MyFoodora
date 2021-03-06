package policy;

import java.util.ArrayList;

import item.Meal;
import item.Offer;
import item.Order;

/**
 * @author Dingo
 * Policy used to sort meals in order
 */
public interface SortPolicy {
	public ArrayList<Offer> shippedOrderSort(ArrayList<Order> orders);
}
