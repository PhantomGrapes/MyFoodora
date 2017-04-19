/**
 * 
 */
package command;

import item.Meal;
import ui.UICore;
import user.Restaurant;

/**
 * @author Dingo
 * for the currently logged on restaurant to add a meal in meal-of-the-week 
 * special offer. 
 */
public class SetSpecialOfferCommand implements Command {

	String mealName;
	
	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public CommandResult execute() throws Exception {
		if (!(UICore.getCurrentUser() instanceof Restaurant))
			return fail("You haven't right to use this command.");
		Restaurant currentUser = (Restaurant) UICore.getCurrentUser();
		Meal m=null;
		for (Meal meal :currentUser.getMenu().getFullMeals()) {
			if(meal.getName() == mealName)
				m = meal;
		}
		for (Meal meal :currentUser.getMenu().getHalfMeals()) {
			if(meal.getName() == mealName)
				m = meal;
		}
		if(m == null)
			return fail("Meal doesn't exist.");
		m.setSpecialOffer(true);
		return success("Successfully set this meal special offer");
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
