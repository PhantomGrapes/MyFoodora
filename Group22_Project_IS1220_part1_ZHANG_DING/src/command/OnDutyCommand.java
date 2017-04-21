/**
 * 
 */
package command;

import ui.UICore;
import user.Courier;
import user.Manager;

/**
 * @author Dingo
 * for the currently logged on courier to set his state as on-duty
 */
public class OnDutyCommand implements Command {

	String username;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Courier))
			return fail("You haven't right to use this command.");
		Courier currentUser = (Courier) UICore.getCurrentUser();
		currentUser.setOnOrOffDuty(true);
		return success("Successfully set on duty");
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
