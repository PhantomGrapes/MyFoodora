package myFoodora;

public interface FidelityPlan {

	public double calculateFinalPrice();
	
	public double visit(Item item);
	
	public double visit(Meal meal);
	
}
