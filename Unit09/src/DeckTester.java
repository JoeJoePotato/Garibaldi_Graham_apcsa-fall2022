/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
       
	/** 
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */ 
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println(d);
		String[] ranks2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
		int[] pointValues2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		String[] suits2= {"hearts", "diamonds", "clubs", "spades"};	
		Deck d2=new Deck(ranks2, suits2, pointValues2);
		System.out.println(d2);
		d2.shuffle();
		System.out.println(d2);
	}
}