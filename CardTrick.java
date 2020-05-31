
package pickacard;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author FarzanSyed
 * @author Farzan Syed
 */
public class CardTrick {
	  public static int pickSuit(){
		int p;
		Random s = new Random();
		int y = s.nextInt(3);
		  return y;
    }

    public static void main(String[] args) {
	    
	    Card [] luckyCard = new Card();
	    luckyCard = "Hearts", 8;
	    
	    Scanner s = new Scanner(System.in);
        Card[] magicHand = new Card[7];
	   Card c = new Card();//Farzan

        for (int i = 0; i < magicHand.length; i++) {
            c.setValue(new Random().nextInt(magicHand.length));
		   c.setSuit(Card.SUITS[pickSuit()]);
		   magicHand[i]=c;
		   
		   System.out.println("Pick a suit:");

			String userCard = s.next();
			System.out.println("Pick a number:");

	String userCardNo = s.next();
		int No = Integer.parseInt(userCardNo);
			
boolean found = false;
        for (int z = 0; z < magicHand.length; z++) {
             if (No == magicHand[z].getValue()) {
                if (userCard.equalsIgnoreCase(magicHand[z].getSuit())) {
                    found = true;
			
                } 
			  System.out.println("Card matches");
            }	
			
				 else{
			  found = false;
					 System.out.println("Card doesn't match");
				 }
				 
			 }	 
           
           
    }
    }
}
    


