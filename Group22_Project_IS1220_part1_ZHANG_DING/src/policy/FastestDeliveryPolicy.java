package policy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import user.Courier;
import user.Customer;
import utilites.Coordinate;

/**
 * @author Dingo
 * Sort the courier list according to their distance to a certain customer
 */
public class FastestDeliveryPolicy implements DeliveryPolicy{
	@Override
	public ArrayList<Courier> sort(ArrayList<Courier> couriers, Customer customer) {
		Collections.sort(couriers, new Comparator<Courier>() {
			@Override
			public int compare(Courier c1, Courier c2){
				return Coordinate.distanceBetweenTwoLocation(c1.getAddress(), customer.getAddress()).compareTo(Coordinate.distanceBetweenTwoLocation(c2.getAddress(), customer.getAddress()));
			}
		});
		return couriers;
	}
}