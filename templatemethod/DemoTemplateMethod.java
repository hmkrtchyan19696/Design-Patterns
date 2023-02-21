package templatemethod;

public class DemoTemplateMethod {

	public static void main(String[] args) {
		
		Hoagie cust1 = new ItalianHoagie();
		
		cust1.makeSandwich();
		
		Hoagie cust2 = new VegetarianHoagie();
		
		cust2.makeSandwich();
	}

}
