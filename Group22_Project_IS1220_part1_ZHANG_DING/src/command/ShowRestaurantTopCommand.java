/**
 * 
 */
package command;

import java.util.ArrayList;

import ui.UICore;
import user.Manager;
import user.Restaurant;

/**
 * @author Dingo
 *for the currently logged on myFoodora manager to display the list of restaurant
 *  sorted in decreasing order w.r.t. the number of delivered orders
 */
public class ShowRestaurantTopCommand implements Command {

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		String result = "";
		ArrayList<Restaurant> c = currentUser.getSortedRestaurants();
		for (int i = 0; i < c.size(); i++) {
			result += c.get(i).getName() + "\n";
		}
		return success(result);
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
