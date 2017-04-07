package item;

/**
 * @author Shoulong
 * Interface of item and meal to implement a visitor pattern for calculating order price.
 */

public interface Offer {

	public double accept(FidelityPlan fidelityPlan);
	
}
