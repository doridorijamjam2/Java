package grademanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Score score = new Score();
	int i=0;
		
	while(true){
		Student student = new Student();
		System.out.println("1.입력 2.수정(이름) 3.삭제(이름) 4.출력");
			
		int insert = sc.nextInt();
			
		switch (insert) {
		case 1:
			score.Input(student);
			i++;
			break;
		case 2:
			score.Modify();
			break;
		case 3:
			score.Delete();
			break;
		case 4:
			score.Output();
			break;

		default:
			break;
		}
        }	
   }
}
