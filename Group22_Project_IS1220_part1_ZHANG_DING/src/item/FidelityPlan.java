package item;

/**
 * @author Shoulong
 * Interface of fidelity plan to calculate the price of an order.
 */

public interface FidelityPlan {
	
	public double calculateFinalPrice(Order order);
	
	public double visit(Item item);
	
	public double visit(Meal meal);
	
}
