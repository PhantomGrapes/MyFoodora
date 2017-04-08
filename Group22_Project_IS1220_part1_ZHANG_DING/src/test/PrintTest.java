package test;

import myFoodora.MyFoodora;
import user.Courier;
import user.Customer;
import user.Manager;
import user.Restaurant;
import user.User;

public class PrintTest {
	public static void main(String[] args) {
		MyFoodora myFoodora = new MyFoodora();
		User user1 = new Manager();
		User user2 = new Restaurant();
		User user3 = new Customer();
		User user4 = new Courier();
		
		myFoodora.addUser(user1);
		myFoodora.addUser(user2);
		myFoodora.addUser(user3);
		myFoodora.addUser(user4);
		
		if(myFoodora.getUsers().size()!= 0){
			System.out.println(myFoodora.getUsers().get(0));
		}else{
			System.out.println("no element");
		}
	}
}
