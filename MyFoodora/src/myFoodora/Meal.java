package myFoodora;

import java.util.ArrayList;

public class Meal implements Offer {

	private String name;
	private String type;
	private String preference;
	
	private boolean isSpecialOffer;
	
	private ArrayList<Item> mealComposer = new ArrayList<Item>();
	
	public double accept(FidelityPlan fidelityPlan){
		return 0;
	}
}
