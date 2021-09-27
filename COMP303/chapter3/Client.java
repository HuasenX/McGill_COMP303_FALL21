package chapter3;

public class Client {
	public static void main(String[] args) {
		Hand hand1 = new Hand(5);
		Hand hand2 = new Hand(4);
		hand1.add(new Card(Rank.ACE, Suit.CLUBS));
		hand1.add(new Card(Rank.EIGHT, Suit.CLUBS));
		hand2.add(new Card(Rank.FIVE, Suit.CLUBS));
		System.out.print(hand2.compareTo(hand1));
	}
}
