/**
 * 
 */
package command;

import item.Order;
import myFoodora.MyFoodora;
import ui.UICore;
import user.Customer;
import user.Restaurant;

/**
 * @author Dingo
 * for the currently logged on restaurant to allocate an 
 * order to a deliverer by application of the current delivery policy
 */
public class FindDelivererCommand implements Command {

	String orderName;
	MyFoodora myFoodora;
	
	
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public MyFoodora getMyFoodora() {
		return myFoodora;
	}

	public void setMyFoodora(MyFoodora myFoodora) {
		this.myFoodora = myFoodora;
	}

	@Override
	public CommandResult execute() throws Exception {
		if (!(UICore.getCurrentUser() instanceof Restaurant))
			return fail("You haven't right to use this command.");
		Restaurant currentUser = (Restaurant) UICore.getCurrentUser();
		Order o = null;
		for (Order order : UICore.getCurrentOrders()) {
			if(order.getName()==orderName)
				o = order;
		}
		if(o==null)
			return fail("Order doesn't exist.");
		if(o.getRestaurant() != currentUser)
			return fail("this is not the order of your restaurant");
		myFoodora.allocateCourier(o);
		return success("Courier "+ o.getCourier().getName()+" will delivery your order.");
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
