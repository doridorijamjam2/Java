package kr.or.shi;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator(반복자)
//특정 컬렉션의 요소들을 차례대로 접근해서 작업하는 기능을 제공하는 인터페이스
public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			//hasNext() : 다음 요소가 있으면 true 반환
			System.out.println(it.next());
			//next() : 다음 요소를 반환하고, 작업 위치를 다음요소 이동
			}
	}

}
