package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.NumberOutOfRangeException;
import item.LotteryPlan;

public class LotteryPlanTest {

	@Test
	public void testVisitItem() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		LotteryPlan card = new LotteryPlan();
		assertTrue(card.visit(data.i1)==4);
	}

	@Test
	public void testVisitMeal() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		LotteryPlan card = new LotteryPlan();
		assertTrue(card.visit(data.meal)==19*0.95);
	}

	@Test
	public void testCalculateFinalPrice() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		LotteryPlan card = new LotteryPlan();
		data.c.registerFidelityPlan(card);
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		double price = card.calculateFinalPrice(data.c.getCurrentOrder());
		assertTrue(price==19*(1-data.r.getGeneiclDiscountFactor()) || price==0);
	}

}
