/**
 * 
 */
package ui;

import java.util.Scanner;

import command.CommandResult;
import myFoodora.MyFoodora;

/**
 * @author Dingo
 *
 */
public class CLUI {
	MyFoodora myFoodora;
	UICore uiCore;
	CLInvoker invoker;
	
	
	
	public CLUI(MyFoodora myFoodora) {
		this.myFoodora = myFoodora;
		uiCore = new UICore();
		invoker = new CLInvoker(myFoodora);
	}
	public CommandResult runCommand(String command) throws Exception{
		String[] args = command.split(" ");
		String[] parameters = new String[args.length-1];
		for (int i = 0; i < args.length-1; i++) {
			parameters[i] = args[i+1];
		}
		CommandResult res = new CommandResult();
		
		switch (args[0]) {
		case "login":
			res = invoker.login(parameters);
			break;
		case "logout":
			res = invoker.logout(parameters);
			break;
		case "registerRestaurant":
			res = invoker.registerRestaurant(parameters);
			break;
		case "registerCustomer":
			res = invoker.registerCustomer(parameters);
			break;
		case "registerCourier":
			res = invoker.registerCourier(parameters);
			break;
		case "addDishRestauarantMenu":
			res = invoker.addDishRestauarantMenu(parameters);
			break;
		case "createMeal":
			res = invoker.createMeal(parameters);
			break;
		case "addDish2Meal":
			res = invoker.addDish2Meal(parameters);
			break;
		case "showMeal":
			res = invoker.showMeal(parameters);
			break;
		case "saveMeal":
			res = invoker.saveMeal(parameters);
			break;
		case "setSpecialOffer":
			res = invoker.setSpecialOffer(parameters);
			break;
		case "removeFromSpecialOffer":
			res = invoker.removeFromSpecialOffer(parameters);
			break;
		case "createOrder":
			res = invoker.createOrder(parameters);
			break;
		case "addItem2Order":
			res = invoker.addItem2Order(parameters);
			break;
		case "endOrder":
			res = invoker.endOrder(parameters);
			break;
		case "onDuty":
			res = invoker.onDuty(parameters);
			break;
		case "offDuty":
			res = invoker.offDuty(parameters);
			break;
		case "findDeliverer":
			res = invoker.findDeliverer(parameters);
			break;
		case "setDeliveryPolicy":
			res = invoker.setDeliveryPolicy(parameters);
			break;
		case "setProfitPolicy":
			res = invoker.setProfitPolicy(parameters);
			break;
		case "associateCard":
			res = invoker.associateCard(parameters);
			break;
		case "showCourierDeliveries":
			res = invoker.showCourierDeliveries(parameters);
			break;
		case "showRestaurantTop":
			res = invoker.showRestaurantTop(parameters);
			break;
		case "showCustomers":
			res = invoker.showCustomers(parameters);
			break;
		case "showMenuItem":
			res = invoker.showMenuItem(parameters);
			break;
		case "showTotalProfit":
			if(parameters.length == 0)
				res = invoker.showTotalProfit(parameters);
			else
				res = invoker.showTotalProfitInAPeriod(parameters);
			break;
		case "runTest":
			res = invoker.runTest(parameters);
			break;
		case "help":
			res = invoker.help(parameters);
			break;

		default:
			res.setResult(false);
			res.setMessage("Command not found.");
		}
		return res;
	}
	public void runCLUI(){
		Scanner scanner = new Scanner(System.in);
		String command = null;
		CommandResult res = null;
		
		while (!(command = scanner.nextLine()).equalsIgnoreCase("quit")){
            try {
				res = runCommand(command);
				System.out.println(res.getMessage());
			} catch (Exception e) {
				System.out.println("Error!");
				System.out.println(e.getMessage());
			}
        }
	}
}
