/**
 * 
 */
package command;

import policy.FairOccupationDeliveryPolicy;
import policy.FastestDeliveryPolicy;
import policy.TargetProfitDeliveryCost;
import policy.TargetProfitMarkup;
import policy.TargetProfitPolicy;
import policy.TargetProfitPolicyFactory;
import policy.TargetProfitServiceFee;
import ui.UICore;
import user.Manager;

/**
 * @author Dingo
 * for the currently logged on myFoodora manager set the profit policy of the 
 * system to that passed as argument
 */
public class SetProfitPolicyCommand implements Command {

	String profitPolicyName;
	
	
	public String getProfitPolicyName() {
		return profitPolicyName;
	}

	public void setProfitPolicyName(String profitPolicyName) {
		this.profitPolicyName = profitPolicyName;
	}

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		TargetProfitPolicyFactory factory = new TargetProfitPolicyFactory();
		TargetProfitPolicy policy = factory.getPolicy(profitPolicyName);
		if(policy == null)
			return fail("Not such target profit policy");
		currentUser.setProfitPolicy(policy);
		return success("Successfully set target profit policy");
	}

	@Override
	public CommandResult success(String message) {
		CommandResult result = new CommandResult();
		result.setMessage(message);
		result.setResult(true);
		return result;
	}

	@Override
	public CommandResult fail(String message) {
		CommandResult result = new CommandResult();
		result.setMessage(message);
		result.setResult(false);
		return result;
	}
}
