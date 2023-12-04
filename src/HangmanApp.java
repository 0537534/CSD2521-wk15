/**
 * Name: Cedrick Dave R. Charles
 * Date: 21 November 2023
 * this is a github test project
 * Purpose: This application purpose is to clean a file called prospect.csv and create a clean file which is modified according to the instructions.
 */
import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman(); 
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}