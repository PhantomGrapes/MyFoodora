package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.NumberOutOfRangeException;
import item.PointPlan;

public class PointPlanTest {

	@Test
	public void testVisitItem() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		PointPlan card = new PointPlan();
		card.setFidelityPoint(100);
		assertTrue(card.visit(data.i1)==4);
	}

	@Test
	public void testVisitMeal() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		PointPlan card = new PointPlan();
		card.setFidelityPoint(100);
		assertTrue(card.visit(data.meal)==19);
	}

	@Test
	public void testCalculateFinalPrice() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		PointPlan card = new PointPlan();
		card.setFidelityPoint(100);
		data.c.registerFidelityPlan(card);
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		double price = card.calculateFinalPrice(data.c.getCurrentOrder());
		System.out.println(price);
		assertTrue(price==19*(1-data.r.getGeneiclDiscountFactor())*0.9);
	}

}
