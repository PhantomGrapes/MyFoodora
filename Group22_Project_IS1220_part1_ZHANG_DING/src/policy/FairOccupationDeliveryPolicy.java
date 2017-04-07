package policy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import user.Courier;
import user.Customer;
import utilites.Coordinate;


/**
 * @author Dingo
 * Sort the courier list according to their number of delivered order without offduty couriers
 */
public class FairOccupationDeliveryPolicy implements DeliveryPolicy{

	@Override
	public ArrayList<Courier> sort(ArrayList<Courier> PrimitiveCouriers, Customer customer) {
		ArrayList<Courier> couriers = new ArrayList<Courier>();
		for (Courier courier : PrimitiveCouriers) {
			if (courier.isOnDuty())
				couriers.add(courier);
		}
		Collections.sort(couriers, new Comparator<Courier>() {
			@Override
			public int compare(Courier c1, Courier c2){
				return c1.counterOfDeliveredOrder() - c2.counterOfDeliveredOrder();
			}
		});
		return couriers;
	}

}
