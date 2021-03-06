/**
 * 
 */
package command;
import ui.UICore;
import user.Manager;
import user.Restaurant;

/**
 * @author Dingo
 * for the currently logged on myFoodora manager to display the menu of a 
 * given restaurant
 */
public class ShowMenuItemCommand implements Command {
	String restaurantName;
	
	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		Restaurant res = null;
		for (Restaurant r : currentUser.getRestaurants()) {
			if(res.getName()==r.getName())
				res = r;
		}
		if(res==null)
			return fail("Can't find this restaurant.");
		return success(res.getMenu().toString());
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
