/**
 * 
 */
package command;

import java.util.Date;

import ui.UICore;
import user.Manager;

/**
 * @author Dingo
 * for the currently logged on myFoodora manager to show the total profit of the 
 * system within a time interval
 */
public class ShowTotalProfitInAPeriodCommand implements Command {
	Date startDate;
	Date endDate;
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public CommandResult execute() throws Exception{
		if (!(UICore.getCurrentUser() instanceof Manager))
			return fail("You haven't right to use this command.");
		Manager currentUser = (Manager) UICore.getCurrentUser();
		return success("Total Income: " + Double.toString(currentUser.getTotalIncome(startDate, endDate)));
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
