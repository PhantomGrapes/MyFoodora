package item;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.NumberOutOfRangeException;
import test.TestUseData;

public class LotteryPlanTest {

	@Test
	public void testVisitItem() throws NumberOutOfRangeException {
		TestUseData data = new TestUseData();
		data.data1();
		LotteryPlan card = new LotteryPlan();
		assertTrue(card.visit(data.i1)==4);
	}

	@Test
	public void testVisitMeal() throws NumberOutOfRangeException {
		TestUseData data = new TestUseData();
		data.data1();
		LotteryPlan card = new LotteryPlan();
		assertTrue(card.visit(data.meal)==19);
	}

	@Test
	public void testCalculateFinalPrice() throws NumberOutOfRangeException {
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
