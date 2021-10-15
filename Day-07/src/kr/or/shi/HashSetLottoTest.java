package kr.or.shi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashSetLottoTest {

	public static void main(String[] args) {
		
		//컬렉션
		//1. 컬렉션의 크기가 늘어나거나 줄어들수 있다.
		//2. 객체만 저장할수 있다.
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size() < 6; i++) {
			//int size() : Collection 에서 제공
			int number = (int)(Math.random() * 45) + 1;
			set.add(number);
		}
		
		//sort
		List<Integer> list = new LinkedList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);

	}

}
