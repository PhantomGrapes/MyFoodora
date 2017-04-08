package item;

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
	
	public Item(String name, String type, String preference, double price) {
		super();
		this.name = name;
		this.type = type;
		this.preference = preference;
		this.price = price;
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

	public void setType(String type) {
		if(type == "Starter" || type == "Main-dish" || type == "Dessert")
			this.type = type;
		else
			System.out.println("Your input of Type is not correct.Please re-input.\n");
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		if(preference == "Standard" || preference == "Vegetarian" || preference == "Gluten-free")
			this.preference = preference;
		else
			System.out.println("Your input of Preference is not correct.Please re-input.\n");
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

	public void setPrice(double price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("Please re-input the price.\n");
	}

	public double accept(FidelityPlan fidelityPlan){
		return fidelityPlan.visit(this);
	}
}
