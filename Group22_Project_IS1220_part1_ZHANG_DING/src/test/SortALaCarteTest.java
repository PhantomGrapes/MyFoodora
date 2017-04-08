package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import exception.NumberOutOfRangeException;
import item.Item;
import item.Order;
import policy.SortALaCarte;

public class SortALaCarteTest {

	@Test
	public void testShippedOrderSort() throws IllegalArgumentException, NumberOutOfRangeException {
		SortALaCarte salc = new SortALaCarte();
		ArrayList<Order> orders = new ArrayList<Order>();
		
		Order order1 = new Order();
		Order order2 = new Order();
		Item item1 = new Item("lala","Starter","Standard",10);
		Item item2 = new Item("fa","Starter","Standard",12);
		
		order1.addToItemList(item1);
		order2.addToItemList(item2);
		order2.addToItemList(item1);
		
		orders.add(order1);
		orders.add(order2);
		
		assertTrue(salc.shippedOrderSort(orders).get(0) == item1);
	}

}
