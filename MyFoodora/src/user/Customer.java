package user;

import java.sql.Date;
import java.util.ArrayList;

import item.BasicPlan;
import item.FidelityPlan;
import item.Item;
import item.Meal;
import item.Order;
import utilites.Coordinate;

public class Customer extends User{
	
	private String surname;
	private String email;
	private String phoneNumber;
	
	private Coordinate address;
	
	private boolean canBeNotified;
	private boolean isNotifiedByEmail;
	
	private FidelityPlan fidelityPlan;
	
	private Order currentOrder;
	private ArrayList<Order> historyOrders = new ArrayList<Order>();
	
	
	// Create an order, Pick items, Finish an order
		public void creatOrder(Restaurant restaurant){
			currentOrder = new Order();
			currentOrder.setCustomer(this);
			currentOrder.setRestaurant(restaurant);
			//currentOrder.setDate(Date.);
			
		}
		
		public void addToOrder(Item item){
			currentOrder.addToItemList(item);
		}
		
		public void addToOrder(Meal meal){
			currentOrder.addToMealList(meal);
		}
		
		public void removeFromOrder(Item item){
			currentOrder.removeFromItemList(item);
		}
		
		public void removeFromOrder(Meal meal){
			currentOrder.removeFromMealList(meal);
		}
		
		public void finishOrder(){
			currentOrder.setFinalPrice(fidelityPlan.calculateFinalPrice(currentOrder));
			// tell myFoodora to find a deliver courier
			// pay for it
			historyOrders.add(currentOrder);
		}
		
	// History orders, print all orders made by this customer
		public void getHistoryOrder(){
			if(historyOrders.size() == 0){
				System.out.println("There is no history order.\n");
			}else{
				for(Order order: historyOrders){
					// Not finished
					System.out.println("");
				}
			}
		}

	// Can be Notified or not, by what method?
		public void setCanBeNotified(boolean canBe){
			canBeNotified = canBe;
		}
		
		public void setBeNotifiedByEmail(boolean byEmail){
			isNotifiedByEmail = byEmail;
		}
		
	// Change Fidelity Plan
		public void registerFidelityPlan(FidelityPlan fp){
			fidelityPlan = fp;
		}
		
		public void unregisterFidelityPlan(){
			fidelityPlan = new BasicPlan();
		}
}
