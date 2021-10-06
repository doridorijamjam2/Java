package kr.or.shi;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		System.out.println(" 1. 입금");
		System.out.println(" 2. 출금");
		System.out.println(" 3. 잔액조회");
		System.out.println(" 4. 프로그램 종료");
		
		Account myAccount = new Account();
		myAccount.getBalance = 10000;
		
		Scanner scanner = new Scanner(System.in);
		
		int Number = scanner.nextInt();
		
		switch(Number) {
		case 1 :
			 myAccount.deposit = scanner.nextInt();
			 myAccount.deposit();
			 System.out.println("입금한 잔액 : " + myAccount.getBalance);
			 break;
		
	    case 2 :
	    	 myAccount.withdraw = scanner.nextInt();
			 myAccount.withdraw();
			 System.out.println("출금한 잔액 : " + myAccount.getBalance);
			 break;
			
	    case 3 :
		    myAccount.getBalance();
		    System.out.println("현재 잔액 : " + myAccount.getBalance);
		    
		  
    	case 4 :
    		myAccount.exit();
    		System.out.println("종료되었습니다.");
		    break;
			
		}
		
		
		

	}

}
