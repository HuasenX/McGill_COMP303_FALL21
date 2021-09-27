package chapter3;

enum Suit {CLUBS, DIAMONDS, SPADES, HEARTS}
enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NIGHT, TEN, JACK, QUEEN, KING}
enum Color {Red, Black}

/*
 * Represent a card with 6 boolean value. 
 */
public class Card {
	//set the boolean attributes private to hide them from client
	private boolean aIsRed = false; //SPADES AND HEARTS ARE RED
	private boolean	aIsHigh = false;//DIAMONDS AND SPADES ARE THE HIGH SUITS
	private boolean b3 = false;
	private boolean b4 = false;
	private boolean b5 = false;
	private boolean b6 = false;

	
		
	public static void main(String[] args) {
		for( Rank rank : Rank.values() )
		{
			for( Suit suit : Suit.values() )
			{
				Card card = new Card(rank, suit);
				assert card.getRank() == rank;
				assert card.getSuit() == suit;
				System.out.println(card);
			}
		}
	}
	//constructor
	public Card(Rank pRank, Suit pSuit){
		assert pRank != null && pSuit != null :"Must know Rank and Suit to define a card.";

		pRanktoBool(pRank);
		pSuittoBool(pSuit);
	}

	private void pRanktoBool(Rank pRank) {
		int value = pRank.ordinal();//the enum.ordinal() return the position of the object in the Rank
		if (value/8 != 0) {
			b3 = true;
		}
		value %= 8;
		if (value/4 != 0) {
			b4 = true;
		}
		value %= 4;
		if (value/2 != 0) {
			b5 = true;
		}
		value %= 2;
		if (value/1 != 0) {
			b6 = true;
		}
		value %= 1;
	}
	private void pSuittoBool(Suit pSuit) {
		if (pSuit == Suit.SPADES || pSuit == Suit.HEARTS) {
			aIsRed = true;
		}
		if (pSuit == Suit.DIAMONDS || pSuit == Suit.SPADES) {
			aIsHigh = true;
		}
	}
	
	public Suit getSuit() {
		if (aIsRed) {
			if(aIsHigh) {
				return Suit.SPADES;
			} else {
				return Suit.HEARTS;
			}
		}else if (aIsHigh) {
			return Suit.DIAMONDS;
		} else {
			return Suit.CLUBS;
		}
	}
	
	public Rank getRank() {
		int value = 0;
		if (b3) {
			value += 8;
		}
		if (b4) {
			value += 4;
		}
		if (b5) {
			value += 2;
		}
		if (b6) {
			value += 1;
		}
		return Rank.values()[value];//enum.values() returns an ordered array of all elements in enum 
	}
	
	public Color color() {
		if (aIsRed) {return Color.Red;} 
		else return Color.Black;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s of %s is of color %s", getRank(), getSuit(), color());
	}
}


