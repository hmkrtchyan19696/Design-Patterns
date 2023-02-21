package templatemethod;

public class VegetarianHoagie extends Hoagie {
	
	String[] vegetablesUsed = {"Lettuse", "Tomato", "Onion", "Sweet Potato"};
	String[] condimentsUsed = {"Oil", "Vinegar"};
	
	boolean customerWantsMeat() {
		return false;
	}
	
	boolean customerWantsCheese() {
		return false;
	}
	
	@Override
	void addMeat() {
		// does nothing
	}

	@Override
	void addCheese() {
		// does nothing		
	}

	@Override
	void addVegetables() {
		System.out.print("Adding the vegetables: ");
		
		for (String vegetable : vegetablesUsed) {
			System.out.print(vegetable + " ");
		}
		System.out.println();
		
	}

	@Override
	void addCondiments() {
		System.out.print("Adding the condiments: ");
		
		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
		System.out.println();
		
	}
}
