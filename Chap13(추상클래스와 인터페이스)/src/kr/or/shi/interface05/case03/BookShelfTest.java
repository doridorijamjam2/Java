package kr.or.shi.interface05.case03;

public class BookShelfTest {
	
	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("코틀린 마이크로서비스 개발1");
		bookQueue.enQueue("코틀린 마이크로서비스 개발2");
		bookQueue.enQueue("코틀린 마이크로서비스 개발3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
	}

}
