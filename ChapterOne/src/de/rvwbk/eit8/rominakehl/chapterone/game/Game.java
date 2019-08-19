package de.rvwbk.eit8.rominakehl.chapterone.game;

import de.rvwbk.eit8.rominakehl.chapterone.blueprint.Dice;

public class Game {

	public static void main(String[] args) {
		final Dice diceOne = new Dice();
		final Dice diceTwo = new Dice();
		final Dice diceThree = new Dice();
		final Dice diceFour = new Dice();
		final Dice diceFive = new Dice();
		
		System.out.println("Würfel1:"+diceOne.getSideUp());
		System.out.println("Würfel2:"+diceTwo.getSideUp());
		System.out.println("Würfel3:"+diceThree.getSideUp());
		System.out.println("Würfel4:"+diceFour.getSideUp());
		System.out.println("Würfel5:"+diceFive.getSideUp());
		
		while(true) {
			Dice dice = new Dice();
		}
	}

}
