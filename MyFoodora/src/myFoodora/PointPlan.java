package myFoodora;

public class PointPlan implements FidelityPlan{
	
	private int points;
	
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
