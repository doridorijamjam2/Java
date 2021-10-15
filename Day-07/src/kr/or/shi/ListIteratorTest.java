package kr.or.shi;

//Iterator: 전반향 이동만 가능
//ListIterator: 후방향 이동도 가능
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();
		

		while(it.hasNext()) {
			//hasNext() : 다음 요소가 있으면 true 반환
			System.out.println(it.next());
			//next() : 다음 요소를 반환하고, 작업 위치를 다음요소 이동
			}
		
		System.out.println();
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}

}
