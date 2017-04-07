package item;

public class LotteryPlan implements FidelityPlan{
	
	private double probability;

	
	@Override
	public double visit(Item item){
		return 0;
	}
	
	@Override
	public double visit(Meal meal){
		return 0;
	}

	@Override
	public double calculateFinalPrice(Order order) {
		return 0;
	}
	
	
}
