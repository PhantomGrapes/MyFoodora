/**
 * 
 */
package command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Dingo
 *
 */
public class HelpCommand implements Command {
	String helpFile;
	
	
	public HelpCommand() {
		helpFile = "CommandLineHelp.txt";
	}

	@Override
	public CommandResult execute() throws Exception{
		String returnValue = "", line = "";
		FileReader file = null;
		BufferedReader reader = null;
		try {
			file = new FileReader(helpFile);
			reader = new BufferedReader(file);
			while ((line = reader.readLine()) != null) { 
				returnValue += line;
			}
			reader.close();
			return success(returnValue);
		}
		catch (FileNotFoundException e) {
			throw new Exception("Help file not found");
		}
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
