package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Order;
import myFoodora.MyFoodora;
import policy.TargetProfitPolicy;
import policy.TargetProfitServiceFee;

public class TargetProfitServiceFeeTest {
	MyFoodora myFoodora = new MyFoodora();
	TargetProfitPolicy tpsf = new TargetProfitServiceFee();
	
	@Test
	public void testMakeDescision() {
		Order order = new Order();
		order.setFinalPrice(10);
		
		myFoodora.setTargetProfitPolicy(tpsf);
		myFoodora.getOrders().add(order);
		
		assertTrue(myFoodora.getTargetProfitPolicy().makeDescision(100, 0, 0, myFoodora)== 100-10*0.1+20);
	}

}
