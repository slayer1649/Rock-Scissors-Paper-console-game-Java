import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playerChosenMove = "";
        String compMove = "";

        int compRandomNum = random.nextInt(3);
        System.out.print("Choose your fighter: [r]ock, [p]apper or [s]cissors: ");
        String playerMove = scanner.nextLine();


        switch (playerMove) {
            case "r", "rock", "Rock":
                playerChosenMove = ROCK;
                break;
            case "p", "paper", "Paper":
                playerChosenMove = PAPER;
                break;
            case "s", "scissors", "Scissors":
                playerChosenMove = SCISSORS;
                break;
            default: {
                System.out.println("Invalid Fighter. Try Again...");

            }
            break;
        }

        switch (compRandomNum) {
            case 0:
                compMove = ROCK;
                break;
            case 1:
                compMove = PAPER;
                break;
            case 2:
                compMove = SCISSORS;
                break;
        }


        System.out.printf("The Enemy chose %s.%n", compMove);

        if ((playerChosenMove.equals("Rock") && compMove.equals("Scissors")) ||
                (playerChosenMove.equals("Paper") && compMove.equals("Rock")) ||
                (playerChosenMove.equals("Scissors") && compMove.equals("Paper"))) {
            System.out.println("You win!");
        } else if ((playerChosenMove.equals("Rock") && compMove.equals("Rock")) ||
                (playerChosenMove.equals("Paper") && compMove.equals("Paper")) ||
                (playerChosenMove.equals("Scissors") && compMove.equals("Scissors"))) {
            System.out.println("Draw");
        } else if ((playerChosenMove.equals("Rock") && compMove.equals("Paper")) ||
                (playerChosenMove.equals("Paper") && compMove.equals("Scissors")) ||
                (playerChosenMove.equals("Scissors") && compMove.equals("Rock"))) {
            System.out.println("You are dead");
        }
    }
}


