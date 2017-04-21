/**
 * 
 */
package command;

import ui.UICore;
import user.Manager;

/**
 * @author Dingo
 *
 */
public class HelpCommand implements Command {

	@Override
	public CommandResult execute() throws Exception{
		return null;
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
