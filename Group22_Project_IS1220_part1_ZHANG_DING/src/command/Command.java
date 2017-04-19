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
	public String execute() throws Exception;
	public String refuse();
}
