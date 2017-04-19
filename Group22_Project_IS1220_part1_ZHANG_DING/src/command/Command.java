/**
 * 
 */
package command;

/**
 * @author Dingo
 * Command interface
 * Aim to design each specific command
 */
public interface Command {
	public CommandResult execute() throws Exception;
	public CommandResult success(String message);
	public CommandResult fail(String message);
}
