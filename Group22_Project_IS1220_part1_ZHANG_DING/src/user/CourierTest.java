package user;

import static org.junit.Assert.*;

import org.junit.Test;

import test.TestUseData;
import utilites.Coordinate;

public class CourierTest {

	@Test
	public void testAcceptTheOrder() throws Exception{
		TestUseData data = new TestUseData();
		data.data1();
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		Courier c = new Courier("Liu", "Qiangdong", "mike", new Coordinate(2, 1), "2234567");
		c.acceptTheOrder(data.c.getCurrentOrder());
		assertTrue(data.c.getCurrentOrder().getCourier()==c);
		assertTrue(c.getDeliveredOrders().get(0) == data.c.getCurrentOrder());
	}

	@Test
	public void testCounterOfDeliveredOrder() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		Courier c = new Courier("Liu", "Qiangdong", "mike", new Coordinate(2, 1), "2234567");
		c.acceptTheOrder(data.c.getCurrentOrder());
		assertTrue(c.counterOfDeliveredOrder()==1);
	}

}
