package myFoodora;

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
