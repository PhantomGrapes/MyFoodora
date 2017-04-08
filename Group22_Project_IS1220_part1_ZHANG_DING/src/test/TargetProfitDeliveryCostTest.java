package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Order;
import myFoodora.MyFoodora;
import policy.TargetProfitDeliveryCost;
import policy.TargetProfitPolicy;

public class TargetProfitDeliveryCostTest {

	MyFoodora myFoodora = new MyFoodora();
	TargetProfitPolicy tpdc = new TargetProfitDeliveryCost();

	@Test
	public void testMakeDescision() {
		Order order = new Order();
		order.setFinalPrice(10);
		
		myFoodora.setTargetProfitPolicy(tpdc);
		myFoodora.getOrders().add(order);
		
		assertTrue(myFoodora.getTargetProfitPolicy().makeDescision(100, 0, 0, myFoodora)== (-100+10*0.1+10));
	}
}
