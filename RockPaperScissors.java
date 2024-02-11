import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nLet's play Rock Paper Scissors.");
        System.out.println("\nWhen I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("\nAre you ready? Write 'yes' if you are\n");
        String user = scan.nextLine();
        if (user.equals("yes")) {
            System.out.println("\nGreat!");
        } else {
            System.out.println("Darn, some other time...\n");
            System.exit(0);
        }
        System.out.println("\nrock - paper - scissors, shoot!\n");
        String ChoiceOfUser = scan.nextLine();
        String choiceOfComputer = computerChoice();

        printResult(ChoiceOfUser, choiceOfComputer, choiceOfComputer);

    }

    public static String computerChoice() {

        int randomNum = (int) (Math.random() * 3);
        if (randomNum == 0) {
            return "rock";
        } else if (randomNum == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String winner(String choiceOfUser, String choiceOfComputer) {

        if (choiceOfUser.equals("rock") && choiceOfComputer.equals("paper")) {
            return "Computer Wins!";
        } else if (choiceOfUser.equals("paper") && choiceOfComputer.equals("rock")) {
            return "You win!";
        } else if (choiceOfUser.equals("paper") && choiceOfComputer.equals("scissors")) {
            return "Computer Wins!";
        } else if (choiceOfUser.equals("scissors") && choiceOfComputer.equals("paper")) {
            return "You win!";
        } else if (choiceOfUser.equals("scissors") && choiceOfComputer.equals("rock")) {
            return "Computer Wins!";
        } else if (choiceOfUser.equals("rock") && choiceOfComputer.equals("scissors")) {
            return "You win!";
        } else {
            return "Enter a valid choice";
        }

    }

    public static void printResult(String choiceOfUser, String choiceOfComputer, String winner) {

        System.out.println("\nYou chose     : " + choiceOfUser);
        System.out.println("Computer chose: " + choiceOfComputer);

        if (choiceOfUser.equalsIgnoreCase(choiceOfComputer)) {
            System.out.println("\nDamn we tied Let's try again");
            System.exit(0);
        }
        String result = winner(choiceOfUser, choiceOfComputer);
        System.out.println("\nGame over -->  " + result + "\n");
    }
}
