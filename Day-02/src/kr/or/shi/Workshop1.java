package kr.or.shi;

import java.util.Scanner;

public class Workshop1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사과개수 : ");
		
		int numOfApples = scan.nextInt();
		int sizeOfBucket = 10;
		
		//바구니의 개수를 구하는 수식
		//1. numOfApples / sizeOfBucket
		//사과의 개수가 120, 130, 200...인 경우
		//사과의 개수가 바구니 크기로 나누어 떨어질때...
		
		//2. numOfApples / sizeOfBucket + 1
		//사과의 개수가 121, 132, 201...인 경우
		//사과의 개수가 바구니 크기로 나누어 떨어지지 않을때...
		
		int numOfBucket = (numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1);

		System.out.println("필요한 바구니의 수 :"+ numOfBucket);

	}

}
