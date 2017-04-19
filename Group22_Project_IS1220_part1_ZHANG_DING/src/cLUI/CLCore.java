/**
 * 
 */
package cLUI;

import user.User;

/**
 * @author Dingo
 *
 */
public class CLCore {
	static User currentUser;

	public static  User getCurrentUser() {
		return currentUser;
	}

	public static void setCurrentUser(User currentUser) {
		CLCore.currentUser = currentUser;
	}
	
	
}
