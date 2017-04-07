package item;

public class BasicPlan implements FidelityPlan{
	
	@Override
	public double visit(Item item){
		return 0;
	}
	
	@Override
	public double visit(Meal meal){
		return 0;
	}
}
