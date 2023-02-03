package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            int value = input.nextInt();
            String suit = (Card.SUITS[random.nextInt(0, 4)]);
            
            Card card = new Card(value, suit);
            hand[i] = card;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        System.out.println("Here are the cards in your hand");
        for (Card card: hand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }
        
        System.out.print("Guess a suit!");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();
        
        System.out.print("Guess a value 1-13!");
        int value = input.nextInt();
        
        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        boolean match = false;
        for (Card card: hand){
           if (card.getValue() == userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())) {
               match = true;
               break;
           }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Max");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Work towards my coop");
        System.out.println("keep a GPA above 3.0");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Dungeons and Dragons");
        System.out.println("Magic the Gathering");
        System.out.println("Cooking");
        System.out.println("Reading");

        System.out.println();
        
    
    }

}
