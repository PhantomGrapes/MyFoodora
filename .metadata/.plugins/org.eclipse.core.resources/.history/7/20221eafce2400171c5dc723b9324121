package item;

import exception.NumberOutOfRangeException;

/**
 * @author Shoulong
 * Single dishes of a menu of restaurant. 
 */

public class Item implements Offer{
	
	private String name;
	private String type;
	private String preference;
	int soldNumber;
	
	private Menu menu;
	
	private double price;
	
	public Item(String name, String type, String preference, double price) throws NumberOutOfRangeException,IllegalArgumentException{
		super();
		setName(name);
		setType(type);
		setPreference(preference);
		setPrice(price);
		this.menu = new Menu();
		this.soldNumber = 0;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type)throws IllegalArgumentException {
		if(type == "Starter" || type == "Main-dish" || type == "Dessert")
			this.type = type;
		else
			throw new IllegalArgumentException("Type of item is not accepted");
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference)throws IllegalArgumentException {
		if(preference == "Standard" || preference == "Vegetarian" || preference == "Gluten-free")
			this.preference = preference;
		else
			throw new IllegalArgumentException("Your input of Preference is not correct.Please re-input.\n");
	}

	//new add
	public int getSoldNumber(){
		return soldNumber;
	}
	
	// new add
	public void setSoldNumber(int n){
		soldNumber = n;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price)throws IllegalArgumentException,NumberOutOfRangeException {
		if (price > Math.pow(10, 300))
			throw new NumberOutOfRangeException();
		else if(price >= 0)
			this.price = price;
		else
			throw new IllegalArgumentException("Invalid price");
	}

	public double accept(FidelityPlan fidelityPlan){
		return fidelityPlan.visit(this);
	}
}
