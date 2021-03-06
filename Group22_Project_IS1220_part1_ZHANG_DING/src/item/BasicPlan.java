package item;

/**
 * @author Shoulong
 * Basic plan of fidelity plan, calculate special meal in a way of special discount factor. 
 */

public class BasicPlan implements FidelityPlan{
	
	
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
		double specialDF = order.getRestaurant().getSpecialDiscountFactor();
		
		double priceOfOrder = 0;
		for(Item i:order.getItemList()){
			priceOfOrder = priceOfOrder + i.accept(fp);
		}
		for(Meal m:order.getMealList()){
			if(m.isSpecialOffer()){
				priceOfOrder = priceOfOrder + (m.accept(fp) * specialDF);
			}else{
				priceOfOrder = priceOfOrder + (m.accept(fp) * genericDF);
			}
		}
		return priceOfOrder;
	}

	@Override
	public double getFidleityPoint() {
		return 0;
	}

	@Override
	public void setFidelityPoint(double i) {
		
	}
}
