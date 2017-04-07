package utilites;

/**
 * @author Shoulong
 * To generate unique ID number for users by using a singleton pattern.  
 */

public class UniqueIDNumberGenerator {
	
	private static UniqueIDNumberGenerator instance = null;
	private int num;
	
	private UniqueIDNumberGenerator(){}
	
	public static UniqueIDNumberGenerator getInstance(){
		if(instance == null){
			instance = new UniqueIDNumberGenerator();
		}
		return instance;
	}
	
	public int getNextIDNumber(){
		return num++;
	}
}
