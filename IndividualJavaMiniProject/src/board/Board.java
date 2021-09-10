package board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Board {
	
	ArrayList<HashMap<String, String>> boardList;
	Scanner sc = new Scanner(System.in);
	
	public Board() {
		boardList = new ArrayList<HashMap<String, String>>();
	}
	
	public void Write() {
		System.out.println("게시판 글을 작성 하세요.");
		System.out.print("작성자 : ");
		String register = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("제목 : ");
		String subject = sc.nextLine();
		System.out.print("글내용 : ");
		String content = sc.nextLine();
		
		
		
		HashMap<String, String> boardMap = new HashMap<String, String>();
		boardMap.put("register", register);
		boardMap.put("email", email);
		boardMap.put("password", password);
		boardMap.put("subject", subject);
		boardMap.put("content", content);
		
		addWrite(boardMap);
		
	}

	private void addWrite(HashMap<String, String> boardMap) {
		 boardList.add(boardMap);
		
	}

	public void list() {
		if(boardList.size() > 0) {
			for(int i=0; i<boardList.size(); i++) {
				System.out.println("작성자 : " + boardList.get(i).get("register")
						            + "제목 : " + boardList.get(i).get("subject")
						            + "이메일 : " + boardList.get(i).get("email")
						            + "글내용 : " + boardList.get(i).get("content"));
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
				if(boardList.get(i).get("register").equals(register) && boardList.get(i).get(password).equals(password));
				index = i;
			
			}
		
			if(index == -1) {
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
			else {
				System.out.println("작성된 글이 존재하지 않습니다.");
			}
		}
	
	}

}
