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
	public CommandResult runCommand(String command){
		String[] args = command.split(" ");
		String[] parameters = new String[args.length-1];
		for (int i = 0; i < args.length-1; i++) {
			parameters[i] = args[i+1];
		}
		switch (args[0]) {
		case value:
			
			break;

		default:
			CommandResult res = new CommandResult();
			res.setResult(false);
			res.setMessage("Command not found.");
			return res;
		}
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
				System.out.println(e.getMessage());
			}
        }
	}
}
