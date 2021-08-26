package kr.or.shi.decision;

import java.util.Scanner;

public class IfNestedTest2 {
	
	/*
	 * 사용자로부터
	 * 성별, 나이, 신체등급순으로 입력 받아서
	 * 신체등급 1~3 : 현역
	 * 신체등급 4  : 공익
	 * 그외 : 면제가 출력되는 프로그램을 만드시오.
	 * 
	 * 단, 성별을 입력받을 시에는 int로 입력받아 1이면 남자, 2면 여자로 판단합니다.
	 * 또한 여자일 경우에는 추가적인 정보 입력 대신 "여성에게는 국방의 의무가 없습니다."가 출력되게 만드시오.
	 * 또한 남자이지만 미성년자일 경우 추가적인 정보 입력 대신 "미성년자에게는 아직 신체등급이 부여되지 않습니다."
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("성별(1은 남자, 2는 여자) : ");
		int sex = scan.nextInt();
		
		
		if(sex == 1 ) {
			System.out.print("나이 : ");
		int age = scan.nextInt();
		
		if(age >= 19) {
			System.out.print("신체 등급(1~4) : ");
			int category = scan.nextInt();
			
			if(category <=3) {
				System.out.println("현역");
			}
			else if(category == 4) {
				System.out.println("공익");
			}
			else {
				System.out.println("면제");
			}
		}
		else {
			System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
		}
		
	}
		else {
			System.out.println("여성에게는 국방의 의무가 없습니다.");
		}
		
		scan.close();

	}

}
