//Norma S
//CST-338
//05/14/17

//Class representing a hand of cards.
public class Hand
{
   
   public static int MAX_CARDS = 50;
   private Card[] myCards;
   private int numCards;
   
   //Default constructor for a hand of cards.
   public Hand()
   {
      myCards = new Card[MAX_CARDS];
      numCards = 0;
   }
   
   //Remove all cards from the hand
   public void resetHand()
   {
      myCards = new Card[MAX_CARDS];
      numCards = 0;
   }
   
   //Adds a card to the nest available position in the myCards array.
   public boolean takeCard(Card card)
   {
      boolean valid;
      if (numCards >= MAX_CARDS)
      {
         valid = false;
      }
      else
      {
         myCards[numCards] = card;
         numCards++;
         valid = true;
      }
      return valid;
   }
}
   
