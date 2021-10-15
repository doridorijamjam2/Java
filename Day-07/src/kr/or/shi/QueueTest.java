package kr.or.shi;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		
		String[] swfArray = {"홀리뱅","코사n버터", "프라우드먼", " 라치카"};
		
		LinkedList<String> queue = new LinkedList<String>();
		
		for(String fighter : swfArray) {
			queue.offer(fighter);
		}
		System.out.println("queue의 크기 : " + queue.size());
		
		String data = "";
		while((data = queue.poll()) != null){
			//요소가 있으면 계속 반복
			System.out.println(data);
		}
		System.out.println("queue의 크기 : " + queue.size());

	}

}
