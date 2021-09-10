package board;

import java.util.ArrayList;
import java.util.Scanner;

public class Boardreal {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Board> boardList;
	
	public Boardreal(){
		boardList = new ArrayList<Board>();
	}
	
	public void write() {
		System.out.println("게시판 글을 작성하세요.");
		System.out.println("작성자 : ");
		String register = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("제목 : ");
		String subject = sc.nextLine();
		System.out.println("글 내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(register, email, subject, content, password);
		addWirte(board);
	}

	private void addWirte(Board board) {
		
		boardList.add(board);
		
	}
	
	public void list() {
		if(boardList.size()>0) {
			for(int i=0; i<boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
		}
		else {
			System.out.println("등록된 글이 없습니다.");
		}
	}
	
	public void remove() {
		
		System.out.println("제거할 글의 작성자와 비밀번호를 입력하세요");
		System.out.println("작성자 : ");
		String register = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		
		remove(register, password);
		
	}

	private void remove(String register, String password) {
		
		if(boardList.size() > 0) {
			int index = -1;
			for(int i=0; i<boardList.size(); i++) {
				if(boardList.get(i).getRegister().equals(register)) {
					if(boardList.get(i).getPassword().equals(password)) {
						boardList.remove(boardList.get(i));
						index = i;
					}
				};
				index = i;
			
			}
		
			if(index == -1) {
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
			else {
				System.out.println("삭제 되었습니다.");
			}
		}
	
		
	}

}
