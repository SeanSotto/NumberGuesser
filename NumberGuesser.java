import java.util.Scanner;
//adds keyboard functionality
public class NumberGuesser {
   public static void main(String[] args) 
   {
      numberGuessingGame();
   }
   
   public static void numberGuessingGame()
   {
      Scanner keyboard = new Scanner(System.in);
      int guess=0;
      
      
      System.out.println("Input the maximum range of numbers from 1 that you want to guess from");
      int upperNumberLimit = keyboard.nextInt();
      int mysteryNumber = (int)(upperNumberLimit*Math.random()+1);
      
      System.out.println("Input the number of attempts you want to have in this game");
      int attempts = keyboard.nextInt();
      int totalAttempts = attempts;
   
      while (guess != mysteryNumber && attempts>0)
      {
         System.out.println("Please input a number between 1 and " + upperNumberLimit + " to guess the mystery number. You have " + attempts + " attempts left."); 
         guess = keyboard.nextInt();
         if (guess == mysteryNumber)
         {
            
            System.out.println("Congratulations! You guessed correctly in " + (totalAttempts - attempts + 1) + " tries! The myster number was indeed " + mysteryNumber + "!");     
         }
         else 
         {
            System.out.print("Sorry, incorrect.");
            attempts = attempts - 1;
            if (guess > mysteryNumber)
            {
               System.out.print(" Your guess is higher than the mystery number. ");
               System.out.println();
            }
            else 
            {
               System.out.print(" Your guess is lower than the mystery number. ");
               System.out.println();
            }
            if ( attempts == 0)
            {
               System.out.println("Sorry! You ran out of attempts, the mystery number was " + mysteryNumber + "!"); 
            }
         }
      
      }
            
      System.out.println("Good Game! Would you like to play again? Type \"Yes\" if so. ");
      if (keyboard.next() == "Yes");
      {
         numberGuessingGame();
      } 
   }
}
