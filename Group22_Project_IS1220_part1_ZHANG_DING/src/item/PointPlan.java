package item;

public class PointPlan implements FidelityPlan{
	
	private int points;
	
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
		
		if(order.getCustomer().getFidelityPoint() >= 100){
			priceOfOrder = priceOfOrder * 0.9;
		}
		
		return priceOfOrder;
	}
}
