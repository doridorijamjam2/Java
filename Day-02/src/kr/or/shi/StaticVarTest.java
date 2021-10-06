package kr.or.shi;

class Product{
	int serialNumber;
	static int count;
	{
		//객체를 생성할때마다 반복적으로 수행해야 하는 작업을 정의
		serialNumber = ++count;
	}
}

public class StaticVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1.serialNumber = " + p1.serialNumber);
		System.out.println("p2.serialNumber = " + p2.serialNumber);
		System.out.println("p3.serialNumber = " + p3.serialNumber);

	}

}
