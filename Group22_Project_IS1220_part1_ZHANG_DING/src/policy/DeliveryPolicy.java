package policy;

import java.util.ArrayList;

import user.Courier;
import user.Customer;

/**
 * @author Dingo
 * Sort the courier list without offduty couriers
 */
public interface DeliveryPolicy {
	public ArrayList<Courier> sort(ArrayList<Courier> PrimitiveCouriers, Customer customer);
}
