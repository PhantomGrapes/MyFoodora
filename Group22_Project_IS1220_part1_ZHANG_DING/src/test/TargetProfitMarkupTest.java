package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Order;
import myFoodora.MyFoodora;
import policy.TargetProfitMarkup;
import policy.TargetProfitPolicy;

public class TargetProfitMarkupTest {

	MyFoodora myFoodora = new MyFoodora();
	TargetProfitPolicy tpm = new TargetProfitMarkup();
	
	@Test
	public void testMakeDescision() {
		Order order = new Order();
		order.setFinalPrice(10);
		
		myFoodora.setTargetProfitPolicy(tpm);
		myFoodora.getOrders().add(order);
		
		assertTrue(myFoodora.getTargetProfitPolicy().makeDescision(100, 0, 0, myFoodora)== (100-10+20)/10);
	}

}
