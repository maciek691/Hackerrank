package Day23_BST2_TicTacToe;

import java.util.Scanner;

public class TicTacToeApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean doYouWantToPlay = true;

        while (doYouWantToPlay) {
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println();
            System.out.println("Pick the character");
            char playerToken = sc.next().charAt(0);
            System.out.println("Pick the character for the opponent");
            char opponentToken = sc.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            System.out.println();
            System.out.println("Now we can start the game" + "Enter a number and your token shall be put in its place./n"
                + "The numbers go from 1 to 9, left to right.");
            TicTacToe.printIndexBoard();
            System.out.println();

            // Let's play
            while (game.gameOver().equals("not Over")) {
                if (game.currentMaker == game.userMaker) {
                    // User turn
                    int spot = sc.nextInt();
                    while(!game.playTurn(spot)) {
                        System.out.println("Try again. "+ spot +" is invalid. This spot is already taken"
                        +"or it is out of range");
                        spot = sc.nextInt();
                    }
                    System.out.println("You picked " + spot + "!");
                } else {
                    // AI turn
                    System.out.println("It's my turn!");
                    // Pick spot
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked "+ aiSpot + "!");
                }
                // Print new board
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            // Set up new game or not
            System.out.println("Do you want to play again? Enter Y if you do. Enter anything else if not.");

            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println();
            System.out.println();
        }
    }
}
