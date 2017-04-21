package command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import ui.CLUI;

/**
 * @author Dingo
 * for a generic user of the CLUI (no need to login) to execute the list of CLUI commands 
 * contained in the testScenario file passed as argument
 */
public class RunTestCommand implements Command {
	String testScenarioFile;
	CLUI clui;
	
	public String getTestScenarioFile() {
		return testScenarioFile;
	}

	public void setTestScenarioFile(String testScenarioFile) {
		this.testScenarioFile = testScenarioFile;
	}

	@Override
	public CommandResult execute() throws Exception{
		// create output file
		File output = new File("testScenarioNoutput.txt.");
		output.createNewFile();
		FileWriter writer = new FileWriter(output);
		writer.flush();
		
		// open operation file
		FileReader input = new FileReader(this.testScenarioFile);
		BufferedReader reader = new BufferedReader(input);

		// read operation and write to output file
		String line = null;
		CommandResult res = null;
		while((line = reader.readLine()) != null){
			if (line.endsWith("\n"))
				line = line.substring(0, line.length()-1);
			res = clui.runCommand(line);
			writer.write(res.getMessage()+"\n");
		}
		reader.close();
		writer.close();
		input.close();
		return success("Successfully run test.");
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
