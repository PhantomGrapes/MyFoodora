package item;

public interface FidelityPlan {
	
	public double calculateFinalPrice(Order order);
	
	public double visit(Item item);
	
	public double visit(Meal meal);
	
}