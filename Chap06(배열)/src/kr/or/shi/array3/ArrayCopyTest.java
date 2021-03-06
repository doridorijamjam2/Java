package kr.or.shi.array3;

import java.util.Arrays;

public class ArrayCopyTest {
	
	public static void main(String[] args) {
		
		int[] origin = new int[] { 10, 77, 33, 50};
		int[] target = new int[10];
		int count = 0;
		
		System.out.println("복사하기 전");
		System.out.println("target 길이 : " + target.length);
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		
		//1) 복사방법 : for문을 이용해서 직접 복사하는 방법
//		for(int i=0; i<origin.length; i++) {
//			target[i] = origin[i];
//		}
		
		//2) 향상된 for문
//	    for(int i : origin) {
//	    	target[count++] = i;
//	    }
	    
	    //3) 복사 방법 : 복사속도가 제일 빠름
//	    System.arraycopy(origin, 0, target, 0, origin.length);
	    
	    //4) 복사 방법 : 배열복사-원본배열과 동일하게 복사를 함
	    target = Arrays.copyOf(origin, origin.length);
	    
		
		System.out.println("복사하기 후");
		System.out.println("target 길이 : " + target.length);
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		System.out.println(target);
	}

}
