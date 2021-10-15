package kr.or.shi;

import java.util.HashSet;
import static java.lang.System.out;
public class HashSetTest {
	
	public static void main(String[] args) {
		String[] songArray = {"Queendom", "불타오르네", "빨개요", "신호등", "Queendom"};
		
		HashSet<String> hs1 = new HashSet();
		HashSet<String> hs2 = new HashSet();
		
		for(String song : songArray) {
			if(!hs1.add(song)) {
				//boolean add : Collection 인터페이스에서 제공
				hs2.add(song);//중복된 데이터 저장
			}
		}
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
		
		System.out.println();
		hs1.removeAll(hs2);
		out.println("hs1.removeAll(hs2)");
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
	}

}
