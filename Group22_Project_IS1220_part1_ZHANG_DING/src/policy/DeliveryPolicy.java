package policy;

import java.util.ArrayList;

import user.Courier;
import user.Customer;

public interface DeliveryPolicy {
	public ArrayList<Courier> sort(ArrayList<Courier> couriers, Customer customer);
}
