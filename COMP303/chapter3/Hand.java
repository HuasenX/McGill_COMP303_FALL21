package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
	/*
	 * ***should use final for aMaxCards and aCards***
	 */
	
	private final int aMaxCards;
	private final List<Card> aCards = new ArrayList<>();
	
	/*
	 * @param the upper bound of number
	 * of cards in a hand, depend on 
	 * the game.
	 * @pre max > 0
	 */
	public Hand(int pMaxCards) {
		assert pMaxCards > 0 :"A hand must have at least one card";
		aMaxCards = pMaxCards;
	}
	
	
	/***Note that the hand cannot be full***/
	/*
	 * Add a new card to the hand
	 * @param the new card
	 * @pre pCard != null
	 * @pre !isFull
	 */
	public void add(Card pCard) {
		assert pCard != null && !isFull();
		aCards.add(pCard);
	}
	
	/***ArrayList can directly remove a specific object without firstly search for it by index***/
	/*
	 * Remove pCard from the hand
	 * @pre the card is in the hand
	 * @param the card to be removed
	 */
	
	public void remove(Card pCard) {
		assert this.contains(pCard): "The card to be removed is not in the hand."; 
		aCards.remove(pCard);
	}
	
	
	/***ArrayList have method contains***/
	/*
	 * Check if the hand contains the 
	 * certain type of card
	 * @param pCard: the card to be find
	 * @return true if pCard is contained
	 */
	public boolean contains(Card pCard) {
		return aCards.contains(pCard);
	}
	
	/*
	 * @return n: the number of cards in the hand
	 */
	public int size() {
		return aCards.size();
	}
	
	/*
	 * @return :true if the Hand is empty
	 */
	public boolean isEmpty() {
		return aCards.size() == 0;
	}
	
	/*
	 * @return :true if the Hand is full
	 */
	public boolean isFull() {
		return aCards.size() == aMaxCards;
	}

	
	/**
	 * Compare 2 hand object by increasing number 
	 * of cards. 
	 * @param o	
	 * @return
	 */
	
	@Override
	public int compareTo(Hand pHand) {
		return this.aCards.size() - pHand.aCards.size();
	}
	
}
