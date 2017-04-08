package user;

import static org.junit.Assert.*;

import org.junit.Test;

import test.TestUseData;

public class CustomerTest {

	@Test
	public void testFinishOrder() throws Exception {
		TestUseData data = new TestUseData();
		data.data1();
		data.c.creatOrder(data.r);
		data.c.addToOrder(data.meal, 1);
		data.c.addToOrder(data.i1, 1);
		data.c.finishOrder();
	}

}
