package kr.or.shi;

import java.util.Scanner;

class Calculate {
	

	public int num;
	int i;
	
	int getFactorial(int num) {
		for(i = num; i > 0; i--) {
		}
		System.out.printf("%d * ", i);
		return 0;
	

	}
	
	public static int getPower(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * getPower(num - 1);
	}
	

}

public class Workshop2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculate c = new Calculate();
		
		c.num = sc.nextInt();
		System.out.println(c.getFactorial(c.num));
		System.out.println(c.getPower(c.num));

	}

}