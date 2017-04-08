package item;

/**
 * @author Shoulong
 * Lottery plan of fidelity plan, there is a chance to have a free meal each day.
 */

public class LotteryPlan implements FidelityPlan{
	
	private double probability;
	
	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
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
		
		if(Math.random() >= probability){
			return 0;
		}else{
			return priceOfOrder;
		}
	}

	@Override
	public int getFidleityPoint() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFidelityPoint(int i) {
		// TODO Auto-generated method stub
		
	}
}
