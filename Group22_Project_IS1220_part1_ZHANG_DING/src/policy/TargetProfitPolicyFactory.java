package policy;

public class TargetProfitPolicyFactory {
	public TargetProfitPolicy getPolicy(String name){
		if(name == "delivery cost")
			return new TargetProfitDeliveryCost();
		if(name == "service fee")
			return new TargetProfitServiceFee();
		if(name == "markup")
			return new TargetProfitMarkup();
		return null;
	}
}
