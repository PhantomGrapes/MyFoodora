/**
 * 
 */
package command;


import java.util.ArrayList;

import ui.UICore;
import user.Courier;
import user.Manager;

/**
 * @author Dingo
 * for the currently logged on myFoodora manager to display the list of couriers 
 * sorted in decreasing order w.r.t. the number of completed deliveries
 */
public class ShowCourierDeliveriesCommand implements Command {

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		String result = "";
		ArrayList<Courier> c = currentUser.getSortedCouriers();
		for (int i = 0; i < c.size(); i++) {
			result += c.get(i).getName() + "\n";
		}
		return success(result);
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
