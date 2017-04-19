package user;

import myFoodora.MyFoodora;
import utilites.UniqueIDNumberGenerator;

/**
 * @author Shoulong
 * Top class of manager, customer, restaurant and courier.. 
 */

public class User {
	// change private to protected, so that children can inherit these attribute
	String name;
	String username;
	String password;
	
	int ID;
	
	boolean isActive;

	MyFoodora myFoodora;

//new add Constructors of User
	public User(){}
	
	public User(String _name, String _username, String _password){
		name = _name;
		username = _username;
		password = _password;
		
		UniqueIDNumberGenerator generator = UniqueIDNumberGenerator.getInstance();
		ID = generator.getNextIDNumber();
	}
	
// Register/Unregister/Login/Logout to system
	public void registerToSystem(){
		
	}
	
	public void unregisterToSystem(){
		
	}
	
	public void loginToSystem(){
		
	}
	
	public void logourFromSystem(){
		
	}
	
// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
