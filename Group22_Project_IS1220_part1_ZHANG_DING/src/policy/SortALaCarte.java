package policy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import item.Item;
import item.Offer;
import item.Order;

/**
 * @author Dingo
 * Sort items shipped in orders
 */
public class SortALaCarte implements SortPolicy{
	@Override
	public ArrayList<Offer> shippedOrderSort(ArrayList<Order> orders) {
		ArrayList<Offer> items = new ArrayList<Offer>();
		ArrayList<Item> itemsTemp;
		
		// find all items
		for (Order o : orders) {
			itemsTemp = o.getItemList();
			if(itemsTemp != null && itemsTemp.size()>0){
				for (Item item : itemsTemp) {
					if(!items.contains(item))
						items.add(item);
				}
			}
		}
		
		// sort items
		Collections.sort(items, new Comparator<Offer>() {
			@Override
			public int compare(Offer o1, Offer o2){
				Item i1 = (Item) o1;
				Item i2 = (Item) o2;
				return i1.getSoldNumber() - i2.getSoldNumber();
			}
		});
		return items;
	}

}
