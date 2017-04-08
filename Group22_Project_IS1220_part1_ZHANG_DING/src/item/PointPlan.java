package item;

/**
 * @author Shoulong
 * Point plan of fidelity plan to gain point every each 10 euros.
 */

public class PointPlan implements FidelityPlan{
	private int fidleityPoint;
	
	public PointPlan() {
		super();
		this.fidleityPoint = 0;
	}

	public int getFidleityPoint() {
		return fidleityPoint;
	}

	@Override
	public void setFidelityPoint(int fidleityPoint) {
		this.fidleityPoint = fidleityPoint;
	}

	@Override
	public double visit(Item item){
		return item.getPrice();
	}
	
	@Override
	public double visit(Meal meal){
		return meal.getPrice();
	}

	@Override
	public double calculateFinalPrice(Order order) {
		FidelityPlan fp = order.getCustomer().getFidelityPlan();
		
		double genericDF = order.getRestaurant().getGeneiclDiscountFactor();
		
		double priceOfOrder = 0;
		for(Item i:order.getItemList()){
			priceOfOrder = priceOfOrder + i.accept(fp);
		}
		for(Meal m:order.getMealList()){
			priceOfOrder = priceOfOrder + (m.accept(fp) * genericDF);
		}
		
		if(order.getCustomer().getFidelityPlan().getFidleityPoint() >= 100){
			priceOfOrder = priceOfOrder * 0.9;
			order.getCustomer().getFidelityPlan().setFidelityPoint(order.getCustomer().getFidelityPlan().getFidleityPoint() - 100); 
		}
		return priceOfOrder;
	}

}
