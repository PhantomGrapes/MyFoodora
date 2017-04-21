package command;

/**
 * @author Dingo
 *
 */
public class RunTestCommand implements Command {

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
