/**
 * 
 */
package command;

import item.Item;
import item.Meal;
import ui.UICore;
import user.Restaurant;

/**
 * @author Dingo
 * for the currently logged on restaurant to add a dish to a meal. In fact, the 
 * type and category had to be specified while find a dish or a meal. To simplify,
 * we only find one meal/item of the given name
 */
public class AddDish2MealCommand implements Command {

	String dishName;
	String mealName;
	
	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

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
		Item i=null;
		for (Meal meal : UICore.getCurrentMeals()) {
			if(meal.getName() == mealName)
				m = meal;
		}
		if(m == null)
			return fail("Meal doesn't exist.");
		for (Item item : currentUser.getMenu().getItems()) {
			if(item.getName() == dishName)
				i = item;
		}
		if(i == null)
			return fail("Dish doesn't exist.");
		m.addToMealComposer(i);
		return success("Successfully add dish to meal.");
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
