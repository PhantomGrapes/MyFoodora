package myFoodora;

public class LotteryPlan implements FidelityPlan{
	
	private double probability;
	
	public double calculateFinalPrice(){
		return 0;
	}
	
	public double visit(Item item){
		return 0;
	}
	
	public double visit(Meal meal){
		return 0;
	}
}
