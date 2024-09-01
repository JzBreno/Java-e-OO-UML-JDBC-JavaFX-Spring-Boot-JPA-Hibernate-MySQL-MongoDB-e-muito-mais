package estudos_diversos;

import java.util.Locale;

public class ativ1_saida_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		String product1 = "Computer";
		@SuppressWarnings("unused")
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %nwhice price is $ %f%n"
				+ "Office Desk, Whice price is $ %f%n", price, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n"
				+ "Measue with eight decimal places: %f%n"
				+ "Rounded (Three decimal places): %.3f%n", age, code, gender,measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point: %.2f", measure);
		
		
	}

}
