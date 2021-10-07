package kr.or.shi;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for( int i = 0; i < CARD_NUM; i++) {
			if(i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1 , true);
			}
			else {
				cards[i] = new SutdaCard(i%10 + 1, false);
			}
		}
	}

void shuffle() {
	SutdaCard temp = null;
	
	for(int i =0; i < cards.length; i++) {
		int index = (int)(Math.random()*19) +1;
		temp = cards[0];
		cards[0] = cards[index];
		cards[index] = temp;
	}
}

SutdaCard pick(int index) {
	return cards[index-1];
}
SutdaCard pick() {
	return cards[(int)(Math.random()*CARD_NUM)];
}
}
class SutdaCard extends Object{
int num;
boolean isKwang;
SutdaCard() {
this(1, true);
}

SutdaCard(int num, boolean isKwang) {
this.num = num;
this.isKwang = isKwang;
}
// info()대신 Object클래스의 toString()을 오버라이딩했다.
public String toString() {
return num + ( isKwang ? "K":"");
}
}

public class Workshop3 {
public static void main(String args[]) {
SutdaDeck deck = new SutdaDeck();
for(int i=0; i < deck.cards.length;i++)
System.out.print(deck.cards[i]+",");
System.out.println();

deck.shuffle();
	for(int i=0; i < deck.cards.length;i++)
		System.out.print(deck.cards[i]+",");
	
	System.out.println();
	System.out.println(deck.pick());
	System.out.println(deck.pick(1));
}
}



