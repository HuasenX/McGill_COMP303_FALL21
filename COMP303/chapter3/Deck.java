package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> aCards = new ArrayList<>();
	
	public Deck() {
		shuffle();
	}
	
	/*
	 * Create a new deck of 52 cards and shuffle it.
	 */
	public void shuffle() {
		aCards.clear();
		for (Suit suit: Suit.values()) {
			for(Rank rank: Rank.values()) {
				aCards.add(new Card(rank,suit));
			}
		}
		
		Collections.shuffle(aCards);
	}
	
	/*
	 * @param pCard the new card on the top
	 * @pre pCard != null 
	 */
	public void push(Card pCard) {
		assert pCard != null :"pCard cannot be null";
		aCards.add(pCard);
	}
	
	/*
	 * Draw a card from the deck
	 * @return the card on the top
	 * @pre aCards is not empty
	 */
	
	public Card draw() {
		assert !aCards.isEmpty();
		return aCards.remove(aCards.size() - 1);
	}
	
	/*
	 * @return true if the deck aCards is empty
	 */
	public boolean isEmpty() {
		return aCards.isEmpty();
	}
	
	/*
	 * @return the read-only, unmodifiale list of aCards
	 */
	public List<Card> getCards(){
		return Collections.unmodifiableList(aCards);
	}

}

	