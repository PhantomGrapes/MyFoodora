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

//new add Constructors of User
	public User(){}
	
	public User(String _name, String _username, String _password){
		name = _name;
		username = _username;
		password = _password;
		
		UniqueIDNumberGenerator generator = UniqueIDNumberGenerator.getInstance();
		ID = generator.getNextIDNumber();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
}
