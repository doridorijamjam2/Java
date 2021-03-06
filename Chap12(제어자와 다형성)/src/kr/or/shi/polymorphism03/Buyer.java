package kr.or.shi.polymorphism03;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
//	public void buy(TV tv) {
//		if(this.money < tv.price) {
//			System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
//			return;
//		}
//		this.money -= tv.price;
//		this.bonusPoint += tv.bonusPoint;
//		System.out.println(tv + "를 구매하셨습니다.");
//	}
//	
//	public void buy(Audio audio) {
//		if(this.money < audio.price) {
//			System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
//			return;
//		}
//		this.money -= audio.price;
//		this.bonusPoint += audio.bonusPoint;
//		System.out.println(audio + "를 구매하셨습니다.");
//	}
//	
//	public void buy(Computer computer) {
//		if(this.money < computer.price) {
//			System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
//			return;
//		}
//		this.money -= computer.price;
//		this.bonusPoint += computer.bonusPoint;
//		System.out.println(computer + "를 구매하셨습니다.");
//	}
	
	
	/*
	 * 매개변수 Product타입의 의미
	 * => Product타입이거나 그의 자손들은 다 올수 있다는 것을 의미함 (매개변수의 다형성)
	 */
	
	public void buy(Product product) {
		if(this.money < product.price) {
			System.out.println("잔액이 부족하여 물건 구입이 안됩니다!");
			return;
		}
		this.money -= product.price;
		this.bonusPoint += product.bonusPoint;
		System.out.println(product + "를 구매하셨습니다.");
	}	

}
