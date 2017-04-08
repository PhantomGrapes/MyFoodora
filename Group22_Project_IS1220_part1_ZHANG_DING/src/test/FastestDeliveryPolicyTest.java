package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import item.Order;
import policy.FairOccupationDeliveryPolicy;
import policy.FastestDeliveryPolicy;
import user.Courier;
import user.Customer;
import utilites.Coordinate;

public class FastestDeliveryPolicyTest {

	@Test
	public void testSort() {
		FastestDeliveryPolicy fop = new FastestDeliveryPolicy();
		
		ArrayList<Courier> couriers = new ArrayList<Courier>();
		Customer cus = new Customer();
		cus.setAddress(new Coordinate(1,0));
		Courier courier1 = new Courier();
		Courier courier2= new Courier();
		
		Order order1 = new Order();
		Order order2 = new Order();
		
		courier1.setOnOrOffDuty(true);
		courier2.setOnOrOffDuty(true);
		courier1.setAddress(new Coordinate(0,0));
		courier2.setAddress(new Coordinate(1,3));
		
		courier1.getDeliveredOrders().add(order1);
		courier2.getDeliveredOrders().add(order2);
		courier2.getDeliveredOrders().add(order1);
		
		couriers.add(courier1);
		couriers.add(courier2);
		
		assertTrue(fop.sort(couriers, cus).get(0) == courier1);
	}

}
