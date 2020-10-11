package Day24;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman!  I will pick a word and you will try to guess it.\n"
                + "If you guess wrong 6 times, then I win.  If you can guess it before then, you win.\n"
                + "Are you ready?  I hope so, because I am");
        System.out.println();
        System.out.println("I have picked my word.  Below is a picture, and below \n"
                + "that is your current guess, which starts off as nothing.  Every time you \n"
                + "guess incorrectly.  I add a body part to the picture.  When there is a full \n"
                + "person, you lose");

        // allows fo multiple games
        boolean doYouWantToPlay = true;

        /* Loop while you still want to play */
        while (doYouWantToPlay) {
            //Setting up the game
            System.out.println("Let's play!");
            /* Create a new hangman game */
            Hangman game = new Hangman();

            /* While the game isn't over, keep looping */
            do {
                //draw things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());

/*              Give the mystery word - for checking/debugging
                System.out.print(game.mysteryWord);*/

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
                    System.out.println("No such character");
                }

                // play game
            }
                while (!game.gameOver());
                    // playing the game


                //Playing again or no?
                System.out.println();
                /* Ask if you want to play another game */
                System.out.println("Do you want to play another game? Enter Y if you do.");
                Character response = (sc.next().toUpperCase().charAt(0));
                /* Play again if the responded Y */
                doYouWantToPlay = (response == 'Y');


        }
    }
}



