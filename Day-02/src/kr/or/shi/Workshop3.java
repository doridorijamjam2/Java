package kr.or.shi;

import java.util.Scanner;

public class Workshop3 {

	public static void main(String[] args) {
//		int num = 456;
//		System.out.println(456 / 100 * 100);
//		System.out.println(456 - 456 % 100);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		
		String strNumber = scanner.next();
		
	    //입력한 숫자의 자릿수 구하기
		int numberLength = strNumber.length();
		
		//나누고 곱하는 값을 구하기
		int digit = 1;
		for(int i = 1; i < numberLength; i++) {
			digit *= 10;
		}
		
		int intNumber = Integer.parseInt(strNumber);
		System.out.println(intNumber / digit * digit);

	}

}
