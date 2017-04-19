/**
 * 
 */
package command;

import ui.UICore;
import user.Courier;
import user.Manager;
import utilites.Coordinate;

/**
 * @author Dingo
 * for the currently logged on manager to add a courier to the system 
 * (by default each newly registered courier is on-duty).
 */
public class RegisterCourierCommand implements Command {
	String firstName;
	String lastName;
	Coordinate position;
	String username;
	String password;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Coordinate getPosition() {
		return position;
	}

	public void setPosition(Coordinate position) {
		this.position = position;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		// register to system
		Courier c = new Courier(firstName, lastName, username, position, password);
		currentUser.registerToSystem(c);
		return success("Successfully register to system.");
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
