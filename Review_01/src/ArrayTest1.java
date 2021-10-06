
public class ArrayTest1 {
	
	public void printInfo(String[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.println("info[" + i + "] = " + info[i]);
		}
	}

	public static void main(String[] args) {
		// 1. 배열 선언
		int[] arr1;
		int arr2[];
		
		// 2. 배열객체 생성
		// 자바에서 배열은 객체다.
		arr1 = new int[3];
		
		// 3. 각 배열영역에 접근해서 값 할당
		// 각 영역에 접근할 때는 index를 사용(0부터 시작)
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
			
		// 4. 배열의 각 영역의 값 조회
		for (int i = 0; i < arr1.length; i++) {
			// 배열의 최대 인덱스 값은 항상 배열의 크기보다 하나 작다.
			System.out.println("Arr1[" + i + "] = " + arr1[i]);
		}
		
		// 5. 배열의 최대 인덱스값은 넘으면 ArrayIndexOutOfBoundsException 발생
		//arr1[3] = 300;
		
		System.out.println();
		
		// 6. 배열의 값을 초기화(할당)하면서 배열 객체 생성
		// 6-1.
		int[] arr3 = {2,3,4,5};
		
		System.out.println("int[] arr3 = {2,3,4,5}");
		for (int i = 0; i < arr3.length; i++) {
			// 배열의 최대 인덱스 값은 항상 배열의 크기보다 하나 작다.
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		
		System.out.println();
		
		// 6-2.
		int[] arr4 = new int[] {1,2,3,4};
		System.out.println("int[] arr4 = new int[] {1,2,3,4}");
		for (int i = 0; i < arr4.length; i++) {
			// 배열의 최대 인덱스 값은 항상 배열의 크기보다 하나 작다.
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
		
		// 두가지 방식의 차이점
		// 1. 배열의 선언과 생성이 분리될 때는 2번 방식만 허용
		int[] arr5;
		//arr5 = {2,3}; X
		arr5 = new int[] {2,3};
		
		// 2. 메소드에 인자로 배열 객체를 전달할때는 2번 방식만 사용가능.
		ArrayTest1 at1 = new ArrayTest1();
//		at1.printInfo({"1","2","3");  X
 		at1.printInfo(new String[] {"1","2","3"});
		
		
		
	}
	

}
