package exception;

public class NumberOutOfRangeException extends Exception {
	@Override
	public String getMessage(){
		return "Number is out of range";
	}
}
