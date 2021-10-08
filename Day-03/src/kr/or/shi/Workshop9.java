package kr.or.shi;

import java.util.Scanner;

public class Workshop9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("**** 도형선택 ****");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		
		System.out.printf("선택 : " );
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println();
			System.out.println("**** 삼각형 넓이 ****");
			System.out.printf("아랫변 : ");
			int lower = sc.nextInt();
			System.out.printf("높이 : ");
			int height = sc.nextInt();
			double result = (0.5 * (lower * height));
			System.out.println();
			System.out.printf("넓이 : %.2f", result);
		}
		else if(select == 2) {
			System.out.println();
			System.out.println("**** 원 넓이 ****");
			System.out.printf("원 반지름 : ");
			int radius = sc.nextInt();
			double result1 = (3.14 *(radius * radius));
			System.out.println();
			System.out.printf("넓이 : %.2f", result1);
		}
		else if(select == 3) {
			System.out.println();
			System.out.println("**** 사다리꼴 넓이 ****");
			System.out.printf("아랫변 : ");
			int lower = sc.nextInt();
			System.out.printf("윗편 : ");
			int upper = sc.nextInt();
			System.out.printf("높이 : ");
			int height = sc.nextInt();
			double result2 = (0.5 * (lower + upper ))* height;
			System.out.println();
			System.out.printf("넓이 : %.2f", result2);
		}
		else if(select == 4) {
			System.out.println();
			System.out.println("감사합니다 ^.^");
			System.out.println("정지하셨습니다.");
		}

	}

}
