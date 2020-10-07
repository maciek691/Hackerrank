package Day23;

public class TicTacToe {

    protected char[] board;
    protected  char userMaker;
    protected char aiMaker;
    protected char winner;
    protected char currentMaker;

    public TicTacToe(char playerToken, char aiMaker) {
        this.userMaker = playerToken;
        this.aiMaker = aiMaker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMaker = userMaker;
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i< board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot -1] = currentMaker;
            currentMaker = (currentMaker == userMaker) ? aiMaker : userMaker;
        }
        return isValid;
    }

    public boolean withinRange (int number) {
        return number >0 && number < board.length +1;
    }

    public boolean isSpotTaken(int number) {
        return board[number-1] != '-';
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if( i % 3 == 0 && i !=0) {
                System.out.println();
                System.out.println("---------------------");
                }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if( i % 3 == 0 && i !=0) {
                System.out.println();
                System.out.println("---------------------");
            }
            System.out.print(" | " + (i +1));
        }
        System.out.println();
    }

    public boolean isThereAWinner() {
        boolean diagonalsAndMiddels = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topAndFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomAndThird = (bottomRow() || thirdCol()) && board[8] != '-';
        if (diagonalsAndMiddels) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        }
        return diagonalsAndMiddels || topAndFirst || bottomAndThird;
    }

    public boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondCol() {
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightDi() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftDi() {
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean isTheBoardFilled () {
        for (int i =0; i < board.length; i++) {
            if (board[i] == '-');
            return false;
        }
        return true;
    }

    public String gameOver() {
        boolean didSomeoneWin = isThereAWinner();
        if (didSomeoneWin) {
            return "We have a winner! The winner is " + this.winner +"'s";
        } else if(isTheBoardFilled()) {
            return "Game Over!";
        } else {
            return "not Over";
        }
    }

}
