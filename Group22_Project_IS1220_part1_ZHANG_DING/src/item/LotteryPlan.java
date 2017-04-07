package item;

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
		double priceOfMeal = 0;
		for(Item i: meal.getMealComposer()){
			priceOfMeal = priceOfMeal + i.getPrice();
		}
		return priceOfMeal;
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
}
