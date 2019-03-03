package improvement1;

/*
 * Implement below code WIHOUT changing internal implementation of DinerMenu and PancakeHouseMenu
 */

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	// prints ALL menus (both breakfast and lunch)
	public void printMenu() {
		// implement here
	}

	// prints all vegetarian menu from both breakfast and lunch
	public void printVegetarianMenu() {
		//implement me
	}

	// returns a particular name menu is vegetarian or not
	public boolean isItemVegetarian(String name) {
		//implement me
		return false;
	}

}
