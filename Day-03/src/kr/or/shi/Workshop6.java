package kr.or.shi;

class Workshop{
	double data1, data2;
	
	public Workshop(double i, double j) {
		this.data1 = i;
		this.data2 = j;
		if(i > j) {
			System.out.println("max = " + i);
		}
		else{
			System.out.println("max = " + j);
		}
		
	}
}
public class Workshop6 {

	public static void main(String[] args) {
		
		Workshop ob1 = new Workshop(10,20);
		Workshop ob2 = new Workshop(12.4, 9.45);
		Workshop ob3 = new Workshop('Z', 'p');


	}

}
