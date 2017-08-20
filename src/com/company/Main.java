package com.company;

public class Main {

    public static void main(String[] args) {
	 static void playGame() {
        int computersNumber; 
        int usersGuess;      
        int guessCount;     
        computersNumber = (int)(100 * Math.random()) + 1;
           
        guessCount = 0;
        System.out.println();
        System.out.print("What is your first guess? ");
        while (true) {
            usersGuess = TextIO.getInt();  
            guessCount++;
            if (usersGuess == computersNumber) {
                System.out.println("Number of guesses was " + guessCount
                        + "  The number was " + computersNumber);
                break;  
            }
            if (guessCount == 9) {
                System.out.println("You didn't get the number");
                System.out.println("You lose. Number was " + computersNumber);
                break; 
            }
           
            if (usersGuess < computersNumber)
                System.out.print("Too low ");
            else if (usersGuess > computersNumber)
                System.out.print("Too high ");
        }
        System.out.println();
    } 

} 
    }
}
