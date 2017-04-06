package myFoodora;

public class Item implements Offer{
	
	private String name;
	private String type;
	private String preference;
	
	private double price;
	
	public double accept(FidelityPlan fp){
		return 0;
	}
}
