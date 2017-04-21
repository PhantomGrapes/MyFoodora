package policy;

public class DeliveryPolicyFactory {
	public DeliveryPolicy getPolicy(String name){
		if(name == "fastest delivery"){
			return new FastestDeliveryPolicy();
		}
		if(name == "fair-occupation delivery"){
			return new FairOccupationDeliveryPolicy();
		}
		return null;
	}
}
