package kr.or.shi;

public class ReturnTest {
	//return
	//메소드 실행을 종료하고, 메소드를 호출한쪽으로 되돌아가라는 의미
	
	void printInfo(String info) {
		if(info.equals("exit")) {
			return;
		}
		System.out.println(info);
	}
	
    //만약, 메소드를 호출한쪽으로 특정값을 전달하면서 메소드 실행을 끝내려면
	//return 키워드 뒤에 전달할 값을 지정한다.
	
	double add(double x, int y) {
		return x + y;
	}
	
	//메소드의 리턴값이 없을 때는
	//return 예약어 뒤에 아무값도 안써도 되고
	void printData(){
		System.out.println();
		return;
	}
	//return을 안쓰면 된다.
	void aaa() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnTest rt = new ReturnTest();
		rt.printInfo("aaa");
		rt.printInfo("bbb");
		rt.printInfo("exit");
		
		System.out.println("2.2 + 10 = " + rt.add(2.2, 10));
		double result = rt.add(2.2, 10);
		System.out.println(result);

	}

}
