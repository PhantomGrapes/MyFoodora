/**
 * 
 */
package command;

import item.Item;
import item.Meal;
import item.Order;
import ui.UICore;
import user.Customer;

/**
 * @author Dingo
 * for the currently logged on customer to add an item 
 * (either a menu item or a meal-deal) to an existing order.
 */
public class AddItem2OrderCommand implements Command {
	String orderName;
	String itemName;
	
	
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public CommandResult execute() throws Exception {
		if (!(UICore.getCurrentUser() instanceof Customer))
			return fail("You haven't right to use this command.");
		Order o = null;
		for (Order order : UICore.getCurrentOrders()) {
			if(order.getName()==orderName)
				o = order;
		}
		if(o==null)
			return fail("Order doesn't exist.");
		for (Item i : o.getRestaurant().getMenu().getItems()) {
			if(i.getName()==itemName){
				o.addToItemList(i);
				return success("Successfully add item to order");
			}
				
		}
		for (Meal m : o.getRestaurant().getMenu().getFullMeals()) {
			if(m.getName()==itemName){
				o.addToMealList(m);
				return success("Successfully add meal to order");
			}
		}
		for (Meal m : o.getRestaurant().getMenu().getHalfMeals()) {
			if(m.getName()==itemName){
				o.addToMealList(m);
				return success("Successfully add meal to order");
			}
		}
		return fail("Can't find item");
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
