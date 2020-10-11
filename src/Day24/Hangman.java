package Day24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    String mysteryWord;
    StringBuilder currentGuess;

    // character guess
    ArrayList<Character> previousGuesses = new ArrayList<>();

    // Max allowable tries
    int maxTries = 6;

    // Current try
    int currentTry = 0;

    // Dictionary
    ArrayList<String> dictionary = new ArrayList<>();

    // Access to external Files
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    // Constructor
    public Hangman() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    public void initializeStreams() throws IOException {
        try{
            // Open the dictionary.txt
            File inFile = new File("/Users/maciejwachowski/Desktop/repozytorium/Hackerrank/src/Day24/dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();

            while(currentLine != null) {
                dictionary.add(currentLine);
                currentLine = bufferedFileReader.readLine();
            }
            bufferedFileReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Could not read the dictionary");
        }
    }

    private String pickWord() {
        Random rand = new Random();

        /*Find the index of the mystery word randomly in the dictionary*/
        int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();
        /* Return the mystery Word */
        return dictionary.get(wordIndex);
    }

    /*Build a string like: _ A _ _ _ _ _, where each _ is a character to guess.*/

    private StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
            current.append("_");
            } else{
            current.append(" ");
            }
        }
        return current;
    }

    public String getFormalCurrentGuess() {
        return "Current guess: " + currentGuess.toString();
    }

    // return if the game is over
    public boolean gameOver() {
        if (didWeWin()) {
            System.out.println();
            System.out.println("You won!");
            return true;
        } else if (didWeLose()) {
            System.out.println();
            System.out.println("You lost. You spent all of your 6 tries. "
                     + "The word was " + mysteryWord + "." );
            return true;
        }
        return false;
    }

    public boolean didWeLose() {
        return currentTry >= maxTries;
    }

    public boolean didWeWin() {
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }

    public String getCondensedCurrentGuess() {
        String guess = currentGuess.toString();
        return guess.replace(" ","");
    }

    public boolean isGuessedAlready (char guess) {
        return previousGuesses.contains(guess);
    }

    public boolean playGuess (char guess) {
        boolean isItAGoodGuess = false;
        previousGuesses.add(guess);
        for (int i = 0; i< mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess) {
                currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
            }
        }
        if (!isItAGoodGuess) {
            currentTry++;
        }
        return isItAGoodGuess;
    }

    public String drawPicture() {
        switch (currentTry) {
            case 0: return noPersonDraw();
            case 1: return addHeadDraw();
            case 2: return addBodyDraw();
            case 3: return addoneArmDraw();
            case 4: return addSecondArmDraw();
            case 5: return addFirstLegDraw();
            default: return fullPersonDraw();
        }
    }

    private String fullPersonDraw() {
        return   "___________\n"+
                "|         |\n"+
                "|         O\n"+
                "|       --|--\n"+
                "|         |\n"+
                "|        ( ) \n"+
                "|         \n";

    }

    private String addFirstLegDraw() {
        return   "___________\n"+
                "|         |\n"+
                "|         O\n"+
                "|       --|--\n"+
                "|         |\n"+
                "|          ) \n"+
                "|         \n";
    }

    private String addSecondArmDraw() {
        return   "___________\n"+
                "|         |\n"+
                "|         O\n"+
                "|       --|--\n"+
                "|         |\n"+
                "|         \n"+
                "|         \n";
    }

    private String addoneArmDraw() {
        return   "___________\n"+
                "|         |\n"+
                "|         O\n"+
                "|         |--\n"+
                "|         |\n"+
                "|         \n"+
                "|         \n";
    }

    private String addBodyDraw() {
        return   "___________\n"+
                "|         |\n"+
                "|         O\n"+
                "|         |\n"+
                "|         |\n"+
                "|         \n"+
                "|         \n";
    }

    private String addHeadDraw() {
        return   "___________\n"+
                "|         |\n"+
                "|         O\n"+
                "|         \n"+
                "|         \n"+
                "|         \n"+
                "|         \n";
    }

    private String noPersonDraw() {
        return "___________\n"+
              "|         |\n"+
              "|         \n"+
              "|         \n"+
              "|         \n"+
              "|         \n"+
              "|         \n";
    }

}
