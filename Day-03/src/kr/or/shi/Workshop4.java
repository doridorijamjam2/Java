package kr.or.shi;

class Entry{
	public String word;
	public Entry() {
		System.out.println("*** 약어사전 ***");
	}
	public Entry(String w) {
		this();
		word = w;
	}
	public void writeView() {
		System.out.println("약어 : " + this.word);
	}
}
	class SubClass extends Entry{
		public String definition;
		int year;
		
		
		public SubClass(String w) {
			super(w);
		}
		public SubClass(String w, String d, int y) {
			this(w);
			definition = d;
			year = y;
		}
		public void printView() {
			System.out.println("원어 : " + this.definition);
			System.out.println("시기출력 : " + this.year);
		}
	}


public class Workshop4 {

	public static void main(String[] args) {
		
		SubClass pp = new SubClass("OOP", "Object Oriented Programming", 1991);
		pp.writeView();
		pp.printView();
		

	}

}
