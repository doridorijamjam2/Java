package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Board board = new Board();
		boolean stop = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("                      메뉴를 입력하세요                        ");
		System.out.println();
		System.out.println("1. 계시판 글쓰기     2. 글 목록보기     3. 글 삭제      4. 종료    ");
		
		int insert = sc.nextInt();
		do {
		switch(insert) {
		case 1:
		   board.Write();
		   break;
		case 2:
			board.list();
			break;
		case 3:
			board.remove();
			break;
		case 4:
			stop = true;
			break;
	
		}
		}
		while(!stop);
		

	}

}
