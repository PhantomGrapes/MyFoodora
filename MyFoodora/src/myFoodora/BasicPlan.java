package myFoodora;

public class BasicPlan implements FidelityPlan{

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
