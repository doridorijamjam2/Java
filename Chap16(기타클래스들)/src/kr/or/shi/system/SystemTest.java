package kr.or.shi.system;

public class SystemTest {

	public static void main(String[] args) {
		
		long sum = 0;
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		for(long i=1; i<1000000000; i++) {
			sum += i;
		
		}
//		long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		System.out.println(sum);
		System.out.println("소요된 시간 : " + (end - start) + "ns");
		System.out.println("소요된 시간 : " + (end - start)/1000000000.0 + "초");
	
	}

}
