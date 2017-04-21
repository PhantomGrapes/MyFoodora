package ui;

import command.CommandResult;
import command.LoginCommand;
import command.LogoutCommand;
import myFoodora.MyFoodora;

/**
 * @author Dingo
 * Receive parameter and execute the correspond command
 */
public class CLInvoker {
	MyFoodora myFoodora;
	
	public CLInvoker(MyFoodora myFoodora) {
		super();
		this.myFoodora = myFoodora;
	}

	public CommandResult invalidInput(){
		CommandResult result = new CommandResult();
		result.setResult(false);
		result.setMessage("Parameter input format is invalid");
		return result;
	}
	public CommandResult login(String[] args) throws Exception{
		if(args.length != 3)
			return invalidInput();
		LoginCommand c = new LoginCommand();
		c.setMyFoodora(myFoodora);
		c.setUsername(args[1]);
		c.setPassword(args[2]);
		return c.execute();
	}
	
	public CommandResult logout(String[] args) throws Exception{
		if(args.length != 1)
			return invalidInput();
		LogoutCommand c = new LogoutCommand();
		return c.execute();
		
	}
	public CommandResult registerRestaurant(String[] args){
		if(args.length != 5)
			return invalidInput();
		
	}
	public CommandResult registerCustomer(String[] args){
		
	}
	public CommandResult registerCourier(String[] args){
		
	}
	public CommandResult addDishRestauarantMenu(String[] args){
		
	}
	public CommandResult createMeal(String[] args){
		
	}
	public CommandResult addDish2Meal(String[] args){
		
	}
	public CommandResult showMeal(String[] args){
		
	}
	public CommandResult saveMeal(String[] args){
		
	}
	public CommandResult setSpecialOffer(String[] args){
		
	}
	public CommandResult removeFromSpecialOffer(String[] args){
		
	}
	public CommandResult createOrder(String[] args){
		
	}
	public CommandResult addItem2Order(String[] args){
		
	}
	public CommandResult endOrder(String[] args){
		
	}
	public CommandResult onDuty(String[] args){
		
	}
	public CommandResult offDuty(String[] args){
		
	}
	public CommandResult findDeliverer(String[] args){
		
	}
	public CommandResult setDeliveryPolicy(String[] args){
		
	}
	public CommandResult setProfitPolicy(String[] args){
		
	}
	public CommandResult associateCard(String[] args){
		
	}
	public CommandResult showCourierDeliveries(String[] args){
		
	}
	public CommandResult showRestaurantTop(String[] args){
		
	}
	public CommandResult showCustomers(String[] args){
		
	}
	public CommandResult showMenuItem(String[] args){
		
	}
	public CommandResult showTotalProfit(String[] args){
		
	}
	public CommandResult showTotalProfit(String[] args){
		
	}
	public CommandResult runTest(String[] args){
		
	}
	public CommandResult help(String[] args){
		
	}
}
