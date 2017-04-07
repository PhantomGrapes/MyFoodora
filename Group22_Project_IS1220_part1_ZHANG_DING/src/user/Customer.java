package user;

import java.util.ArrayList;

import item.BasicPlan;
import item.FidelityPlan;
import item.Item;
import item.Meal;
import item.Order;
import item.PointPlan;
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
	
	private int fidelityPoint;
	
// getters and setters
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isNotifiedByEmail() {
		return isNotifiedByEmail;
	}

	public FidelityPlan getFidelityPlan() {
		return fidelityPlan;
	}

	public Order getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}

	public ArrayList<Order> getHistoryOrders() {
		return historyOrders;
	}

	public boolean isCanBeNotified() {
		return canBeNotified;
	}
	
	public Coordinate getAddress(){
		return address;
	}

	public void setAddress(Coordinate address) {
		this.address = address;
	}

	public int getFidelityPoint() {
		return fidelityPoint;
	}

	public void setFidelityPoint(int fidelityPoint) {
		this.fidelityPoint = fidelityPoint;
	}

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
		// new add
		currentOrder.getRestaurant().addOrder(currentOrder);
		ArrayList<Meal> meals=currentOrder.getMealList();
		if(meals != null && meals.size()>0){
			for (Meal meal : meals) {
				meal.setSoldNumber(meal.getSoldNumber()+1);
			}
		}
		
		if(fidelityPlan instanceof PointPlan){
			fidelityPoint = fidelityPoint + (int)((int)currentOrder.getFinalPrice()/10);
		}
	}
	
// History orders, print all orders made by this customer
	public void getHistoryOrder(){
		if(historyOrders.size() == 0){
			System.out.println("There is no history order.\n");
		}else{
			for(Order order: historyOrders){
				// Not finished
				System.out.println(order.getDate());
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