package templatemethod;

/**
 * Type of sandwich
 * @author hmkrt
 *
 */
abstract class Hoagie {
	
	final void makeSandwich() {
		
		cutBun();
		
		if (customerWantsMeat()) {
			addMeat();
		}
		
		if (customerWantsCheese()) {
			addCheese();
		}
		
		if (customerWantsVegetables()) {
			addVegetables();
		}
		
		if (customerWantsCondiments()) {
			addCondiments(); 
		}
		
		wrapTheHoagie();
	}
	
	void cutBun() {
		System.out.println("The Hoagie is cut");
	}
	
	void wrapTheHoagie() {
		System.out.println("The Hoagie is wrapped\n");
	}
	
	/**
	 * force the user to override those abstract methods
	 */
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments(); 
	
	/**
	 * hook - it's optional for the user to override those methods
	 * @return
	 */
	boolean customerWantsMeat() {
		return true;
	}
	
	boolean customerWantsCheese() {
		return true;
	}
	
	boolean customerWantsVegetables() {
		return true;
	}
	
	boolean customerWantsCondiments() {
		return true;
	}

}
