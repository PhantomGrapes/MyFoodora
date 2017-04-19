/**
 * 
 */
package command;

import cLUI.CLCore;

/**
 * @author Dingo
 * To allow the currently logged on user to log off
 */
public class LogoutCommand implements Command {

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public String execute() throws Exception{
		if(CLCore.getCurrentUser() == null)
			return refuse();
		// Logout current account
		CLCore.setCurrentUser(null);
		return "Successfully logout.";
	}

	/* (non-Javadoc)
	 * @see command.Command#refuse()
	 */
	@Override
	public String refuse() {
		// User has no right to use this command
		return "You haven't login.";
	}

}
