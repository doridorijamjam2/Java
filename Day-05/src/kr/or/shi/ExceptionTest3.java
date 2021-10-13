package kr.or.shi;

//PipeException
public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			int number = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
			if(e.getClass().getName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
				System.out.println("인자를 입력하세요");
			}
			else {
				System.out.println("숫자를 입력하세요");
			}
		}

	}

}
