package item;

public class FidelityPlanFactory {
	public FidelityPlan getPlan(String name){
		if(name == "basic plan")
			return new BasicPlan();
		if(name == "lottery plan")
			return new LotteryPlan();
		if(name == "point plan")
			return new PointPlan();
		return null;
	}
}
