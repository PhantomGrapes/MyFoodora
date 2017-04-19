/**
 * 
 */
package command;


import cLUI.CLCore;
import user.Manager;
import user.Restaurant;
import utilites.Coordinate;


/**
 * @author Dingo
 * For the currently logged on manager to add a restaurant of given name, 
 * address (i.e. address should be a bi-dimensional co-ordinate), username 
 * and password to the system.
 */
public class RegisterRestaurantCommand implements Command {
	String name;
	Coordinate address;
	String username;
	String password;
	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public String execute() throws Exception{
		if (!(CLCore.getCurrentUser() instanceof Manager))
			return refuse();
		Manager currentUser = (Manager) CLCore.getCurrentUser();
		Restaurant r = new Restaurant(name, address, username, password);
		currentUser.registerToSystem(r);
		return "Successfully register to system.";
	}

	/* (non-Javadoc)
	 * @see command.Command#refuse()
	 */
	@Override
	public String refuse() {
		// User has no right to use this command
		return "You haven't right to use this command.";
	}

}
