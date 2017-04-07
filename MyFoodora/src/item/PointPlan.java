package item;

public class PointPlan implements FidelityPlan{
	
	private int points;
	
	@Override
	public double visit(Item item){
		return 0;
	}
	
	@Override
	public double visit(Meal meal){
		return 0;
	}

}
