package myFoodora;

public class User {
	
	private String name;
	private String username;
	private String password;
	
	private int ID;
	
	private boolean isActive;
	
	private MyFoodora myFoodora;
	
	
// All getters and Setters. 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public MyFoodora getMyFoodora() {
		return myFoodora;
	}

	public void setMyFoodora(MyFoodora myFoodora) {
		this.myFoodora = myFoodora;
	}

// Constructors of User
	public User(){
		
	}
	
// Register/Unregister to system
	public void registerToSystem(){
		
	}
	
	public void unregisterToSystem(){
		
	}
}
