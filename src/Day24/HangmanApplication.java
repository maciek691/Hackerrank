package Day24;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman");
        System.out.println();
        System.out.println("I have pict my word. Below is a picture.");


        // allows fo multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            //Setting up the game
            System.out.println("Let's play!");
            Hangman game = new Hangman();

            do {
                //draw things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
//                System.out.print(game.mysteryWord);

                // get the guess
                System.out.println("Enter a character");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                // check if the character is guessed already
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You already guessed that character");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }

                if (game.playGuess(guess)) {
                    System.out.println("Good guess!");
                } else {
                    System.out.println("no such character");
                }

                // play game
            }
                while (!game.gameOver());
                    // playing the game


                //Playing again or no?
                System.out.println();
                System.out.println("Do you want to play another game? Enter Y if you do");
                Character response = (sc.next().toUpperCase().charAt(0));
                doYouWantToPlay = (response == 'Y');


        }
    }
}



