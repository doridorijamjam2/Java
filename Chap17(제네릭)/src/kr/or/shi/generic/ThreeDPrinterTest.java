package kr.or.shi.generic;

public class ThreeDPrinterTest {

	private static Object Object;

	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter01 printer = new ThreeDPrinter01();
		printer.setMaterial(powder);
		
		Powder p = printer.getMaterial();
		
		Plastic Plastic = new Plastic();
		ThreeDPrinter02 printer02 = new ThreeDPrinter02();
		printer02.setMaterial(Plastic);
		
		Plastic p2 = printer02.getMaterial();
		
		ThreeDPrinter03 printer03 = new ThreeDPrinter03();
		printer03.setMaterial(Object);
		
		Powder p3 = (Powder)printer03.getMaterial();

	}

}
