package test;

import exception.NumberOutOfRangeException;
import item.Item;
import item.Meal;
import item.Menu;
import myFoodora.MyFoodora;
import user.Courier;
import user.Customer;
import user.Manager;
import user.Restaurant;
import utilites.Coordinate;

public class ScenarioTest {

	public static void main(String[] args) throws IllegalArgumentException, NumberOutOfRangeException {
		// Test a scenario for the "Use case scenario" part in the announcement of project.
		
		// Part1: Startup scenario.
		
		MyFoodora myFoodora = new MyFoodora();
		
		Manager manager1 = new Manager("Ruixue","Ding","Dingo","1234", myFoodora);
		Manager manager2 = new Manager("Shoulong", "Zhang","Zhango","4321", myFoodora);
		
		Restaurant restaurant1 = new Restaurant("Resto1", new Coordinate(1,1), "Resto1", "1");
		Restaurant restaurant2 = new Restaurant("Resto2", new Coordinate(2,2), "Resto2", "2");
		Restaurant restaurant3 = new Restaurant("Resto3", new Coordinate(3,3), "Resto3", "3");
		Restaurant restaurant4 = new Restaurant("Resto4", new Coordinate(4,5), "Resto4", "4");
		Restaurant restaurant5 = new Restaurant("Resto5", new Coordinate(5,5), "Resto5", "5");
		
		Courier courier1 = new Courier("Courier", "One", "Courier1", new Coordinate(11,11), "1");
		Courier courier2 = new Courier("Courier", "Two", "Courier2", new Coordinate(22,22), "2");
		
		Customer customer1 = new Customer("Customer", "One", "Customer1", new Coordinate(1,2), "1");
		Customer customer2 = new Customer("Customer", "Two", "Customer2", new Coordinate(2,3), "2");
		Customer customer3 = new Customer("Customer", "Three", "Customer3", new Coordinate(3,4), "3");
		Customer customer4 = new Customer("Customer", "Four", "Customer4", new Coordinate(4,5), "4");
		Customer customer5 = new Customer("Customer", "Five", "Customer5", new Coordinate(5,6), "5");
		Customer customer6 = new Customer("Customer", "Six", "Customer6", new Coordinate(6,7), "6");
		Customer customer7 = new Customer("Customer", "Eight", "Customer7", new Coordinate(7,8), "7");
		
		myFoodora.addUser(manager1);
		myFoodora.addUser(manager2);
		myFoodora.addUser(restaurant1);
		myFoodora.addUser(restaurant2);
		myFoodora.addUser(restaurant3);
		myFoodora.addUser(restaurant4);
		myFoodora.addUser(restaurant5);
		myFoodora.addUser(courier1);
		myFoodora.addUser(courier2);
		myFoodora.addUser(customer1);
		myFoodora.addUser(customer2);
		myFoodora.addUser(customer3);
		myFoodora.addUser(customer4);
		myFoodora.addUser(customer5);
		myFoodora.addUser(customer6);
		myFoodora.addUser(customer7);
		
		Menu menu1 = new Menu(restaurant1);
		Menu menu2 = new Menu(restaurant2);
		Menu menu3 = new Menu(restaurant3);
		Menu menu4 = new Menu(restaurant4);
		Menu menu5 = new Menu(restaurant5);
		
		Item item1s = new Item("dish1","Starter","Standard", 10);
		Item item1v = new Item("dish1","Starter","Vegetarian", 10);
		Item item1g = new Item("dish1","Starter","Gluten-free", 10);
		
		Item item2s = new Item("dish2","Main-dish","Standard", 15);
		Item item2v = new Item("dish2","Main-dish","Vegetarian", 15);
		Item item2g = new Item("dish2","Main-dish","Gluten-free", 15);
		
		Item item3s = new Item("dish3","Dessert","Standard", 8);
		Item item3v = new Item("dish3","Dessert","Vegetarian", 8);
		Item item3g = new Item("dish3","Dessert","Gluten-free", 8);
		
		Item item4s = new Item("dish4","Starter","Standard", 9);
		Item item4v = new Item("dish4","Starter","Vegetarian", 9);
		Item item4g = new Item("dish4","Starter","Gluten-free", 9);
		
		Item item5s = new Item("dish5","Main-dish","Standard", 12);
		Item item5v = new Item("dish5","Main-dish","Vegetarian", 12);
		Item item5g = new Item("dish5","Main-dish","Gluten-free", 12);
		
		Item item6s = new Item("dish6","Dessert","Standard", 5);
		Item item6v = new Item("dish6","Dessert","Vegetarian", 5);
		Item item6g = new Item("dish6","Dessert","Gluten-free", 5);
		
		Meal meal1s = new Meal("Meal1", "fullMeal", "Standard");
		meal1s.getMealComposer().add(item1s);
		meal1s.getMealComposer().add(item2s);
		meal1s.getMealComposer().add(item3s);
		Meal meal1v = new Meal("Meal1", "fullMeal", "Vegetarian");
		meal1v.getMealComposer().add(item1v);
		meal1v.getMealComposer().add(item2v);
		meal1v.getMealComposer().add(item3v);
		Meal meal1g = new Meal("Meal1", "fullMeal", "Gluten-free");
		meal1g.getMealComposer().add(item1g);
		meal1g.getMealComposer().add(item2g);
		meal1g.getMealComposer().add(item3g);		
		
		Meal meal2s = new Meal("Meal2", "fullMeal", "Standard");
		meal2s.getMealComposer().add(item4s);
		meal2s.getMealComposer().add(item2s);
		meal2s.getMealComposer().add(item3s);
		Meal meal2v = new Meal("Meal2", "fullMeal", "Vegetarian");
		meal2v.getMealComposer().add(item4v);
		meal2v.getMealComposer().add(item2v);
		meal2v.getMealComposer().add(item3v);
		Meal meal2g = new Meal("Meal2", "fullMeal", "Gluten-free");
		meal2g.getMealComposer().add(item4g);
		meal2g.getMealComposer().add(item2g);
		meal2g.getMealComposer().add(item3g);
		
		Meal meal3s = new Meal("Meal3", "fullMeal", "Standard");
		meal3s.getMealComposer().add(item1s);
		meal3s.getMealComposer().add(item5s);
		meal3s.getMealComposer().add(item3s);
		Meal meal3v = new Meal("Meal3", "fullMeal", "Vegetarian");
		meal3v.getMealComposer().add(item1v);
		meal3v.getMealComposer().add(item5v);
		meal3v.getMealComposer().add(item3v);
		Meal meal3g = new Meal("Meal3", "fullMeal", "Gluten-free");
		meal3g.getMealComposer().add(item1g);
		meal3g.getMealComposer().add(item5g);
		meal3g.getMealComposer().add(item3g);
		
		Meal meal4s = new Meal("Meal4", "fullMeal", "Standard");
		meal4s.getMealComposer().add(item1s);
		meal4s.getMealComposer().add(item2s);
		meal4s.getMealComposer().add(item6s);
		Meal meal4v = new Meal("Meal4", "fullMeal", "Vegetarian");
		meal4v.getMealComposer().add(item1v);
		meal4v.getMealComposer().add(item2v);
		meal4v.getMealComposer().add(item6v);
		Meal meal4g = new Meal("Meal4", "fullMeal", "Gluten-free");
		meal4g.getMealComposer().add(item1g);
		meal4g.getMealComposer().add(item2g);
		meal4g.getMealComposer().add(item6g);
		
		menu1.getItems().add(item1s);
		menu1.getItems().add(item1v);
		menu1.getItems().add(item1g);
		menu1.getItems().add(item2s);
		menu1.getItems().add(item2v);
		menu1.getItems().add(item2g);
		menu1.getItems().add(item3s);
		menu1.getItems().add(item3v);
		menu1.getItems().add(item3g);
		menu1.getItems().add(item4s);
		menu1.getItems().add(item4v);
		menu1.getItems().add(item4g);
		menu1.getItems().add(item5s);
		menu1.getItems().add(item5v);
		menu1.getItems().add(item5g);
		menu1.getItems().add(item6s);
		menu1.getItems().add(item6v);
		menu1.getItems().add(item6g);
		menu1.getFullMeals().add(meal1s);
		menu1.getFullMeals().add(meal1v);
		menu1.getFullMeals().add(meal1g);
		menu1.getFullMeals().add(meal2s);
		menu1.getFullMeals().add(meal2v);
		menu1.getFullMeals().add(meal2g);
		menu1.getFullMeals().add(meal3s);
		menu1.getFullMeals().add(meal3v);
		menu1.getFullMeals().add(meal3g);
		menu1.getFullMeals().add(meal4s);
		menu1.getFullMeals().add(meal4v);
		menu1.getFullMeals().add(meal4g);
		menu1.getFullMeals().get(0).setSpecialOffer(true);

		menu2.getItems().add(item1s);
		menu2.getItems().add(item1v);
		menu2.getItems().add(item1g);
		menu2.getItems().add(item2s);
		menu2.getItems().add(item2v);
		menu2.getItems().add(item2g);
		menu2.getItems().add(item3s);
		menu2.getItems().add(item3v);
		menu2.getItems().add(item3g);
		menu2.getItems().add(item4s);
		menu2.getItems().add(item4v);
		menu2.getItems().add(item4g);
		menu2.getItems().add(item5s);
		menu2.getItems().add(item5v);
		menu2.getItems().add(item5g);
		menu2.getItems().add(item6s);
		menu2.getItems().add(item6v);
		menu2.getItems().add(item6g);
		menu2.getFullMeals().add(meal1s);
		menu2.getFullMeals().add(meal1v);
		menu2.getFullMeals().add(meal1g);
		menu2.getFullMeals().add(meal2s);
		menu2.getFullMeals().add(meal2v);
		menu2.getFullMeals().add(meal2g);
		menu2.getFullMeals().add(meal3s);
		menu2.getFullMeals().add(meal3v);
		menu2.getFullMeals().add(meal3g);
		menu2.getFullMeals().add(meal4s);
		menu2.getFullMeals().add(meal4v);
		menu2.getFullMeals().add(meal4g);
		menu2.getFullMeals().get(1).setSpecialOffer(true);
		
		menu3.getItems().add(item1s);
		menu3.getItems().add(item1v);
		menu3.getItems().add(item1g);
		menu3.getItems().add(item2s);
		menu3.getItems().add(item2v);
		menu3.getItems().add(item2g);
		menu3.getItems().add(item3s);
		menu3.getItems().add(item3v);
		menu3.getItems().add(item3g);
		menu3.getItems().add(item4s);
		menu3.getItems().add(item4v);
		menu3.getItems().add(item4g);
		menu3.getItems().add(item5s);
		menu3.getItems().add(item5v);
		menu3.getItems().add(item5g);
		menu3.getItems().add(item6s);
		menu3.getItems().add(item6v);
		menu3.getItems().add(item6g);
		menu3.getFullMeals().add(meal1s);
		menu3.getFullMeals().add(meal1v);
		menu3.getFullMeals().add(meal1g);
		menu3.getFullMeals().add(meal2s);
		menu3.getFullMeals().add(meal2v);
		menu3.getFullMeals().add(meal2g);
		menu3.getFullMeals().add(meal3s);
		menu3.getFullMeals().add(meal3v);
		menu3.getFullMeals().add(meal3g);
		menu3.getFullMeals().add(meal4s);
		menu3.getFullMeals().add(meal4v);
		menu3.getFullMeals().add(meal4g);
		menu3.getFullMeals().get(2).setSpecialOffer(true);
		
		menu4.getItems().add(item1s);
		menu4.getItems().add(item1v);
		menu4.getItems().add(item1g);
		menu4.getItems().add(item2s);
		menu4.getItems().add(item2v);
		menu4.getItems().add(item2g);
		menu4.getItems().add(item3s);
		menu4.getItems().add(item3v);
		menu4.getItems().add(item3g);
		menu4.getItems().add(item4s);
		menu4.getItems().add(item4v);
		menu4.getItems().add(item4g);
		menu4.getItems().add(item5s);
		menu4.getItems().add(item5v);
		menu4.getItems().add(item5g);
		menu4.getItems().add(item6s);
		menu4.getItems().add(item6v);
		menu4.getItems().add(item6g);
		menu4.getFullMeals().add(meal1s);
		menu4.getFullMeals().add(meal1v);
		menu4.getFullMeals().add(meal1g);
		menu4.getFullMeals().add(meal2s);
		menu4.getFullMeals().add(meal2v);
		menu4.getFullMeals().add(meal2g);
		menu4.getFullMeals().add(meal3s);
		menu4.getFullMeals().add(meal3v);
		menu4.getFullMeals().add(meal3g);
		menu4.getFullMeals().add(meal4s);
		menu4.getFullMeals().add(meal4v);
		menu4.getFullMeals().add(meal4g);
		menu4.getFullMeals().get(3).setSpecialOffer(true);

		menu5.getItems().add(item1s);
		menu5.getItems().add(item1v);
		menu5.getItems().add(item1g);
		menu5.getItems().add(item2s);
		menu5.getItems().add(item2v);
		menu5.getItems().add(item2g);
		menu5.getItems().add(item3s);
		menu5.getItems().add(item3v);
		menu5.getItems().add(item3g);
		menu5.getItems().add(item4s);
		menu5.getItems().add(item4v);
		menu5.getItems().add(item4g);
		menu5.getItems().add(item5s);
		menu5.getItems().add(item5v);
		menu5.getItems().add(item5g);
		menu5.getItems().add(item6s);
		menu5.getItems().add(item6v);
		menu5.getItems().add(item6g);
		menu5.getFullMeals().add(meal1s);
		menu5.getFullMeals().add(meal1v);
		menu5.getFullMeals().add(meal1g);
		menu5.getFullMeals().add(meal2s);
		menu5.getFullMeals().add(meal2v);
		menu5.getFullMeals().add(meal2g);
		menu5.getFullMeals().add(meal3s);
		menu5.getFullMeals().add(meal3v);
		menu5.getFullMeals().add(meal3g);
		menu5.getFullMeals().add(meal4s);
		menu5.getFullMeals().add(meal4v);
		menu5.getFullMeals().add(meal4g);
		menu5.getFullMeals().get(4).setSpecialOffer(true);
	
		myFoodora.notifyUsers("Welcome to MyFoodora. You are agree to be notified of special offers");
	}
}
