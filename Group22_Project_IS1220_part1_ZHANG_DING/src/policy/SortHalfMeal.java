package policy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import item.Meal;
import item.Offer;
import item.Order;
import user.Courier;


/**
 * @author Dingo
 * Sort half meals in orders
 */
public class SortHalfMeal implements SortPolicy{

	@Override
	public ArrayList<Offer> shippedOrderSort(ArrayList<Order> orders) {
		ArrayList<Offer> halfMeals = new ArrayList<Offer>();
		ArrayList<Meal> meals;
		
		// find all half meals
		for (Order o : orders) {
			meals = o.getMealList();
			if(meals != null && meals.size()>0){
				for (Meal meal : meals) {
					if(meal.getType() == "halfMeal" && !halfMeals.contains(meal))
						halfMeals.add(meal);
				}
			}
		}
		
		// sort half meals
		Collections.sort(halfMeals, new Comparator<Offer>() {
			@Override
			public int compare(Offer o1, Offer o2){
				Meal m1 = (Meal) o1;
				Meal m2 = (Meal) o2;
				return m2.getSoldNumber() - m1.getSoldNumber();
			}
		});
		return halfMeals;
	}

}
