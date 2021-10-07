//메소드에 인자를 전달하는 방식
//자바에서는 메소드를 호출할때 전달하는 인자값이 복사되어 메소드로 전달
package kr.or.shi;

class Data{
	int x;
	int y;
	
	void addPriv(int x, int y) {
		x += 100;
		y += 100;
	}
	
	void addObj(Data data) {
		x += 100;
		y += 100;
	}
	
	void addRef(Data data) {
		data = null;
		//자바에서 레퍼런스 변수에 유일하게 할당할수 있는 상수값은 null이다.
	}
	
	void printInfo(String...info) {
		//가변인자 타입에서 인자는 배열취급
		System.out.println("length " + info.length);
		
		for(int i = 0; i < info.length; i++) {
		}
	}
}



public class ArgsTest {

	public static void main(String[] args) {
		
		Data data = new Data();
		data.x = 10;
		data.y = 10;
		
		System.out.println("data.x = " + data.x);
		System.out.println("data.y = " + data.y);
		
		data.addPriv(data.x, data.y);
		System.out.println("data.addPriv(data.x, data.y)");
		System.out.println("data.x = " + data.x);
		System.out.println("data.y = " + data.y);
		
		data.addObj(data);
		System.out.println("data.addObj(data)");
		System.out.println("data.x = " + data.x);//110
		System.out.println("data.y = " + data.y);//110
		
		data.addRef(data);
		System.out.println("data.addRef(data)");
		System.out.println("data.x = " + data.x);//110
		System.out.println("data.y = " + data.y);//110
		
		data.printInfo();
		data.printInfo("aaa");
		data.printInfo("aaa", "bbb");

	}

}
