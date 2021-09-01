package kr.or.shi.generic03;

public class GenericPrinterTest {

	private static Plastic plastic;

	public static void main(String[] args) {
		Powder powder = new Powder();
		
		/*
		 * 다이아몬든 연산자<>
		 */
		
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(powder);
		
		Powder p = printer.getMaterial();
		System.out.println(printer.toString());
		
		GenericPrinter<Plastic> printer2 = new GenericPrinter<>();
		printer2.setMaterial(plastic);
		
		Plastic p2 = printer2.getMaterial();
		System.out.println(printer2);
	//  아무거나 다 들어갈수 없게 되어 안전함.	
	//	GenericOrubter<Water> printer3 = new GenericPrinter<>();

	}

}
