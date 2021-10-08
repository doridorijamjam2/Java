package kr.or.shi;

import java.util.Scanner;

class HealthSuper{
	protected String gender;
	protected double tall;
	protected double weight;
	
	public HealthSuper(String q, double w, double e) {
		gender = q;
		tall = w;
		weight = e;
		
		
	}
	
	public void input() {
		System.out.println(gender);
		System.out.println(tall);
		System.out.println(weight);
	}
	
	public void output1() {
		System.out.println("성별(M/F) : " + this.gender);
		System.out.println("신장(Cm) : " + this.tall);
		System.out.println("체중(Kg) : " + this.weight);
	}
}

class HealthChild extends HealthSuper{


	public double s_weight;
	public double fat;
	private String result;

	
	public HealthChild(String q, double w, double e) {
		super(q, w, e);
		s_weight = e;
		
		
	}

	
	public void calculate() {
		
		String a = "M";
		

		if(a == "M") {
			s_weight = (tall - 100) * 0.9;
			fat = (weight / s_weight) * 100;
		}
		else {
			s_weight = (tall - 100) * 0.85;
			fat = (weight / s_weight) * 100;
		}
		
	
		fat = weight / s_weight * 100;
		
		if(fat <= 90) {
			System.out.printf("당신의 비만도 %.2f 이고, 저체중 입니다.", fat );
		}
		else if(fat >= 91 && fat <= 110){
			System.out.printf("당신의 비만도 %.2f 이고, 정상(표준체중) 입니다.", fat);
		}
		else if(fat >= 111 && fat <= 120){
			System.out.printf("당신의 비만도 %.2f 이고, 과체중 입니다.", fat);
		}
		else if(fat >= 121 && fat <= 130){
			System.out.printf("당신의 비만도 %.2f 이고, 경도비만 입니다.", fat);
		}
		else if(fat >= 131 && fat <= 150){
			System.out.printf("당신의 비만도  %.2f 이고, 중도비만 입니다.", fat);
		}
		else {
			System.out.printf("당신의 비만도  %.2f 이고, 고도비만 입니다.", fat);
		}
		
	}
	
	public void output2() {
		System.out.println("성별 - " + this.gender);
		System.out.println("신장 - " + this.tall + "Cm");
		System.out.println("체중 - " + this.weight + "Kg");
		
	}
}

public class Workshop8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String q = sc.next();
		double w = sc.nextDouble();
		double e = sc.nextDouble();
		
		HealthChild aa = new HealthChild(q, w, e);
		
		
		aa.output1();
		aa.output2();
		aa.calculate();

	}

}
