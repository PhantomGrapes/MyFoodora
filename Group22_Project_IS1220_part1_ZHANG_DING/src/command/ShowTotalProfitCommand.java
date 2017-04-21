/**
 * 
 */
package command;
import ui.UICore;
import user.Manager;

/**
 * @author Dingo
 * for the currently logged on myFoodora manager to show the total profit 
 * of the system since creation
 */
public class ShowTotalProfitCommand implements Command {

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		return success("Total Income: " + Double.toString(currentUser.getTotalIncome()));
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
