package kr.or.shi;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//C(Create)
		list.add("aaa"); //0
		list.add("bbb"); //1
		list.add("ccc"); //2
		list.add("ddd"); //3
		
		//R(Read)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//삽입
		list.add(1, "삽입1");
		System.out.println("list.add(1, \"삽입1\")");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//특정 컬렉션에 담겨진 요소들을 한번에 삽입하기
		ArrayList<String> appendList = new ArrayList<String>();
		
		appendList.add("111");
		appendList.add("222");
		appendList.add("333");
		
		list.addAll(appendList);
		System.out.println("list.addAll(appendList)");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//특정 컬렉션에 담겨진 요소들을 한번에 삽입하기
		ArrayList<String> insertList = new ArrayList<String>();
		insertList.add("insert1");
		insertList.add("insert2");
		insertList.add("insert3");
		
		list.addAll(1, insertList);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//U(Update)
		list.set(0, "수정데이터");
		System.out.println("(0, 수정데이터)");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//D(Delete)
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove("insert2");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	

	}

}
