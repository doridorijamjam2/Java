
package kr.or.shi;

class SalarySuper{
	public String name;
	public int salary;
	
	public SalarySuper(String n, int s) {
		name = n;
		salary = s;
	
	}
	
	public void getInfomation() {
		System.out.println(name);
		System.out.println(salary);
	}
}

class SalarySub extends SalarySuper{
	String department;
	
	public SalarySub(String n, int s, String d) {
		
		super(n, s);
		department = d;
		
	}
	public void getInfomation() {
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + salary);
		System.out.println("부서 : " + department);
	}
	
}

public class Workshop5 {

	public static void main(String[] args) {
		
		SalarySub ob = new SalarySub("오정원",15000000,"프리렌서");
		ob.getInfomation();
		


	}

}
