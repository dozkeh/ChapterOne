/**
 * 
 */
package de.rvwbk.eit8.rominakehl.chapterone.blueprint;

import java.util.Random;

/**
 * Class of a dice to play games
 * @author rominakehl
 * @version 1.0
 *
 */
public class Dice {
	

	/**
	 * @param sideUp contains the number of the side at the top of the dice
	 */
	
	private int sideUp;
	
	/**
	 * Constructor to generate a concrete dice. It initializes <code>sideUp</code>.
	 *
	 */
	
	public Dice() {
		rollTheDice();
	}
	
	public int getSideUp() {
		return sideUp;
	}

	public void setSideUp(int sideUp) {
		this.sideUp = sideUp;
	}
	
	/**
	 * Changes the number of the parameter <code>sideUp</code>, possible values are between 1 and 6
	 */
	
	public void rollTheDice() 
	{
		Random number = new Random(); 
	 	this.sideUp = number.nextInt(6)+1;  
	}

	
	
	

}
