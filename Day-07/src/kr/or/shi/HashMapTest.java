package kr.or.shi;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cityArray = {"서울", "워싱턴" ,"평양", "런던", "춘천", "경산"};
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		for (int i = 0; i < cityArray.length; i++) {
			hashMap.put(i, cityArray[i]);
		}
		
		Set<Integer> keySet = hashMap.keySet();
		//맵의 키값들만 가져옴.
		
		for(Integer key : keySet) {
			System.out.println(hashMap.get(key));
			//지정한 key에 대한 값 출
		}
	}

}
