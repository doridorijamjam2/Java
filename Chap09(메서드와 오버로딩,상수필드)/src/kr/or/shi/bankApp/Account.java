package kr.or.shi.bankApp;

public class Account {
	
	private String ano;                 // 계좌번호
	private String owner;               // 계죄주
	private int balance;                // 잔액
	
	//매개변수가 있는 생성자
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
