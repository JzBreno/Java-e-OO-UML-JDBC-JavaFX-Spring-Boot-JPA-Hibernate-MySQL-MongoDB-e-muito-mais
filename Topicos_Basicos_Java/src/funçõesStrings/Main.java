package funçõesStrings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "aZ3pX9fM1rG7bQ0kW5sY";
		String lowerString = original.toLowerCase();
		String upperString = original.toUpperCase();
		String recortada = original.substring(8);
		String recortada2 = original.substring(8, original.length() - 4);
		String mudada = original.replace("G7bQ0", "Breno");
		
		
		System.out.println("Original: "+original);
		System.out.println("Lower String: "+lowerString);
		System.out.println("Upper String: "+upperString);
		System.out.println("Recordata: "+recortada);
		System.out.println("Recortada ate o final: "+recortada2);
		System.out.println("String mudada: "+mudada);
		System.out.println("String com index: "+ original.indexOf('3'));

	}

}
