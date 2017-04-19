/**
 * 
 */
package command;

import ui.UICore;

/**
 * @author Dingo
 * To allow the currently logged on user to log off
 */
public class LogoutCommand implements Command {

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public CommandResult execute() throws Exception{
		if(UICore.getCurrentUser() == null)
			return fail("You haven't login.");
		// Logout current account
		UICore.clear();
		return success("Successfully logout.");
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
