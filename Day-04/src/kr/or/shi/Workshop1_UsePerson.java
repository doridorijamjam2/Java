package kr.or.shi;

public class Workshop1_UsePerson {

	public static void main(String[] args) {
		
		Workshop1_Person []pArr = new Workshop1_Person[3];
		
		pArr[0] = new Workshop1_Person("홍길동1", 21, "서울시 구로구 구로동 212번지");
		pArr[1] = new Workshop1_Person("홍길동2", 22, "서울시 구로구 구로동 213번지");
		pArr[2] = new Workshop1_Person("홍길동3", 23, "서울시 구로구 구로동 214번지");
		
		System.out.println(pArr[0].toString());
		System.out.println(pArr[1].toString());
		System.out.println(pArr[2].toString());

	}

}
