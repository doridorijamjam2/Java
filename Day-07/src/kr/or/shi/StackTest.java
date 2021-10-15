package kr.or.shi;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] houseArray = {"아파트", "오피스텔", "원룸", "빌라", "별장"};
		Stack<String> stack = new Stack<String>();
		
		for(String house : houseArray) {
			stack.push(house);
		}
		while(!stack.isEmpty()) {
			//boolean isEmpty : Collection 에서 제공
			//요소가 없으면 true 반환
			System.out.println(stack.pop());
		}
	}

}
