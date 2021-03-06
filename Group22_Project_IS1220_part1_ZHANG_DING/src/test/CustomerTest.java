package test;

import static org.junit.Assert.*;

import org.junit.Test;

import item.PointPlan;

public class CustomerTest {

	@Test
	public void testFinishOrderPrice() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		PointPlan card = new PointPlan();
		card.setFidelityPoint(100);
		data.c.registerFidelityPlan(card);
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		data.c.addToOrder(data.i1, 1);
		data.c.finishOrder();
		assertTrue(data.c.getCurrentOrder().getFinalPrice() == (4+19*0.95)*0.9);
	}
	
	@Test
	public void testFinishOrderFidelityPoints() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		PointPlan card = new PointPlan();
		card.setFidelityPoint(100);
		data.c.registerFidelityPlan(card);
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		data.c.addToOrder(data.i1, 1);
		data.c.finishOrder();
		System.out.println(card.getFidleityPoint());
		assertTrue(card.getFidleityPoint()==(4+19*0.95)*0.9*0.1);
	}
}
