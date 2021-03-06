package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.NumberOutOfRangeException;
import item.Item;

public class ItemTest {

	@Test(expected=IllegalArgumentException.class)
	public void testSetType() throws NumberOutOfRangeException,IllegalArgumentException {
		Item i = new Item("burger", "jfiwej", "Standard", 1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSetPreference() throws NumberOutOfRangeException,IllegalArgumentException {
		Item i = new Item("burger", "Main-dish", "dsfs", 1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSetNegativePrice() throws NumberOutOfRangeException,IllegalArgumentException {
		Item i = new Item("burger", "Main-dish", "Standard", -1);
	}

	@Test(expected=NumberOutOfRangeException.class)
	public void testSetBigPrice() throws NumberOutOfRangeException,IllegalArgumentException {
		Item i = new Item("burger", "Main-dish", "Standard", Math.pow(10, 309));
	}
}
