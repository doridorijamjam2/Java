package kr.or.shi;

public class Workshop5 {

	public static void main(String[] args) {
		
		int i = 1, ans = 0;
		while(ans <= 100) {
			ans += (i % 2 == 0) ? -i : i;
			i++;
		}
		System.out.println(i);

	}

}
