import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String developer = "Abdul";
    String guess = "" ;
    int guessCount = 0;
    int guessLimit = 5;
    boolean guessComplete = false;


    while ( !guess.equals(developer) && !guessComplete) {
        if (guessCount < guessLimit) {
            System.out.print("Guess the developer of this program: ");
            guess = input.nextLine();
            guessCount++;
        } else {
            guessComplete = true;
        }
    }
        if ( guessComplete) {
            System.out.println("you Loss the game");
        } else {
            System.out.println("You won");
        }

    }
}