/**
 * 
 */
package command;

import policy.DeliveryPolicy;
import policy.DeliveryPolicyFactory;
import policy.FairOccupationDeliveryPolicy;
import policy.FastestDeliveryPolicy;
import ui.UICore;
import user.Manager;

/**
 * @author Dingo
 * for the currently logged on myFoodora manager to set the delivery 
 * policy of the system to that passed as argument(fastest delivery
 * or fair-occupation delivery)
 */
public class SetDeliveryPolicyCommand implements Command {
	String delPolicyName;
	
	public String getDelPolicyName() {
		return delPolicyName;
	}

	public void setDelPolicyName(String delPolicyName) {
		this.delPolicyName = delPolicyName;
	}

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		DeliveryPolicyFactory factory = new DeliveryPolicyFactory();
		DeliveryPolicy policy = factory.getPolicy(delPolicyName);
		if(policy == null)
			return fail("Not such delivery policy");
		currentUser.setDeliveryPolicy(policy);
		return success("Successfully set delivery policy");
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
