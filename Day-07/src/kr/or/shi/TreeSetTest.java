package kr.or.shi;


import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; set.size() < 6; i++) {
			//int size() : Collection 에서 제공
			int number = (int)(Math.random() * 45) + 1;
			set.add(number);
		}
		System.out.println(set);

	}

}
