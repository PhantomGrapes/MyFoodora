/**
 * 
 */
package command;

import ui.UICore;
import user.Courier;

/**
 * @author Dingo
 * for the currently logged on courier to set his state as off-duty
 */
public class OffDutyCommand implements Command {
	String username;
	
	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Courier))
			return fail("You haven't right to use this command.");
		Courier currentUser = (Courier) UICore.getCurrentUser();
		currentUser.setOnOrOffDuty(false);
		return success("Successfully set off duty");
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
