package kr.or.shi.array2;

import java.util.Scanner;

public class TwoDArrayTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] student;
		
		//반수, 인원, (점수)합계, 전체합계
		int count = 0, num = 0, sum = 0, total = 0;
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("반 수 입력 : ");
		count = scan.nextInt();
		student = new int[count][]; //반의 갯수를 할당
		System.out.println("2차원 배열 주소 : " + student);
		System.out.println("2차원 배열 크기 : " + student.length);
		
		//----------------------------------------------------------------------
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d반의 인원 : ", i+1);
			
			num = scan.nextInt();      //반의 인원을 받음
			student[i] = new int[num]; //1차원 배열 생성
			
			for(int j=0; j<student[i].length; j++) {
				System.out.printf("%d반의 %d번의 점수 : ", (i+1),(j+1));
				student[i][j] = scan.nextInt();   //실제 반 인원의 점수를 받음
			}
			System.out.println();
		}
		
		//점수가 제대로 입력되었는지 확인
//		for(int i=0; i<student.length; i++) {
//			for(int j=0; j<student[i].length; j++) {
//				System.out.print(student[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("번호\t총점\t평균\t");
		System.out.println("==================================");
		
		for(int i=0; i<student.length; i++) {
			sum = 0; //반별 합계
			for(int j=0; j<student.length; j++) {
				sum += student[i][j];   //반별 합계
			}
			total += sum;               //(반별 합계의) 총합
			avg = (double)sum/student[i].length; //반별 평균
			avgTotal += avg;                     //반별 평균의 총합
			
			System.out.printf("%d반\t%d\t%.1f\n", i+1, sum, avg);
			
		}
		    
		    avgTotal = avgTotal / student.length;
		    System.out.printf("계\t%d\t%.1f\n", total, avgTotal);
		
		
		scan.close();

	}

}
