package grademanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Score {
	
	Scanner sc = new Scanner(System.in);
	
	int person;
	HashMap<Integer, Student> student;
	int number = 0;
	
	Score() {
		student = new HashMap<Integer, Student>();
	}

	public void Input(Student st) {
		
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		st.setName(name);

		System.out.println(name + "의 국어 성적을 입력해주세요");
		int kor = sc.nextInt();
		st.setKorea(kor);

		System.out.println(name + "의 영어 성적을 입력해주세요");
		int eng = sc.nextInt();
		st.setEnglish(eng);

		System.out.println(name + "의 수학 성적을 입력해주세요");
		int mat = sc.nextInt();
		st.setMath(mat);

		st.setSum(kor, eng, mat);
		st.result();

		student.put(number,st);
		
		number = number+1;
	}

	public void Output() {

		Set<Integer> keySet = student.keySet();
		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {
		    int key = iterator.next();

		    System.out.print(" 이름 :" + student.get(key).getName());
		    System.out.print(" 국어 :" + student.get(key).getKorea());
	       	    System.out.print(" 영어 :" + student.get(key).getEnglish());
		    System.out.print(" 수학 :" + student.get(key).getMath());
		    System.out.print(" 총점 :" + student.get(key).getSum());
		    System.out.print(" 평균 :" + student.get(key).getAvg());
		    System.out.println(" ");
		}
	}

	public void Modify() {

	    System.out.println("누구를 수정하시겠습니까?");
	    String name = sc.next();

	    Set<Integer> keySet = student.keySet();
	    Iterator<Integer> iterator = keySet.iterator();

	    while (iterator.hasNext()) {
		int key = iterator.next();

		if (name.equals(student.get(key).getName())) {
		    System.out.println(student.get(key).getName() + "님의 바뀐 국어성적을 입력해주세요");
		    int kor = sc.nextInt();
		    student.get(key).setKorea(kor);

		    System.out.println(student.get(key).getName() + "님의 바뀐 영어성적을 입력해주세요");
		    int eng = sc.nextInt();
		    student.get(key).setEnglish(eng);

		    System.out.println(student.get(key).getName() + "님의 바뀐 수학성적을 입력해주세요");
		    int mat = sc.nextInt();
		    student.get(key).setMath(mat);
		    student.get(key).setSum(kor, eng, mat);
		    student.get(key).result();
		}
	   }
    }

    public void Delete() {
	System.out.println("누구를 삭제하시겠습니까?");
	String name = sc.next();

	for (int i = 0; i < student.size(); i++) {
	    if (name.equals(student.get(i).getName())) {
		student.remove(i);
		}
      	  }
    }

}
