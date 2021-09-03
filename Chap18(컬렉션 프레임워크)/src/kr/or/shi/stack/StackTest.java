package kr.or.shi.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(300));
		
		System.out.println("=스택=");
		while(!coinBox.empty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getVaule());
			
		}

	}

}


