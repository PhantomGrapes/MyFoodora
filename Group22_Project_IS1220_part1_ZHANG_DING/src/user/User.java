package user;

import myFoodora.MyFoodora;

public class User {
	// change private to protected, so that children can inherit these attribute
	String name;
	String username;
	String password;
	
	int ID;
	
	boolean isActive;

	MyFoodora myFoodora;

// Constructors of User
	public User(){
		
	}
	
// Register/Unregister to system
	public void registerToSystem(){
		
	}
	
	public void unregisterToSystem(){
		
	}

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
