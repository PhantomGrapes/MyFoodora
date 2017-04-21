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
 * for the currently logged on restaurant to create 
 * a meal with a given name, mealCategory(fullMeal or halfMeal), food type
 * (standard,vegetarian, gluten-free). This is different from project indication,
 * because user has to use all these three parameters to specify a meal rather 
 * than only a name
 */
public class CreateMealCommand implements Command {
	String mealName;
	String mealCategory;
	String foodType;
	
	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	
	public String getMealCategory() {
		return mealCategory;
	}

	public void setMealCategory(String mealCategory) {
		this.mealCategory = mealCategory;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	/* (non-Javadoc)
	 * @see command.Command#execute()
	 */
	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Restaurant))
			return fail("You haven't right to use this command.");
		Meal m = new Meal(mealName, mealCategory, foodType);
		if(UICore.getCurrentMeals().contains(m))
			return fail("Meal already existed.");
		UICore.getCurrentMeals().add(m);
		return success("Successfully create meal");
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
