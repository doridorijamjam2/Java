package kr.or.shi;

import java.util.Scanner;

public class Workshop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("중간고사 : ");
		int mid = sc.nextInt();
		System.out.printf("기말고사 : ");
		int fin = sc.nextInt();
		System.out.printf("레포트 : ");
		int rep = sc.nextInt();
		System.out.printf("출석 : ");
		int att = sc.nextInt();
		
		double grade = ((mid + fin) / 2 * 0.6) + (rep *0.2) + (att * 0.2);
		int grade1 = (int) (((mid + fin) / 2 * 0.6) + (rep *0.2) + (att * 0.2));
		
		System.out.printf("성적 : %.2f", grade);
		System.out.println();
		
		if(grade > 89) {
			System.out.println("학점 : A");
		}
		else if(grade >79) {
			System.out.println("학점 : B");
		}
		else if(grade >69) {
			System.out.println("학점 : C");
		}
		else if(grade >59) {
			System.out.println("학점 : D");
		}
		else {
			System.out.println("학점 : F");
		}
		
		switch(grade1/10) {
		case 10 :
			System.out.println("평가 : excellent");
			break;
		case 9 :
			System.out.println("평가 : excellent");
			break;
		case 8 :
			System.out.println("평가 : good");
			break;
		case 7 :
			System.out.println("평가 : good");
			break;
		default : 
			System.out.println("평가 : poor");
			break;

			
		}

	}

}
