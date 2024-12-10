import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Millionaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayWelcomeMessage();

        String playerName;
        while (true) {
            System.out.print("Enter the First name of the player: ");
            playerName = scanner.nextLine();
            if (playerName.matches("^[a-zA-Z]+$")) {
                break;
            } else {
                System.out.println("Invalid name! Please enter letters only, no special characters or digits.");
            }
        }

        int moneyWon = 0;

        // Array to store questions, options, and answers
        Object[][] questions = {
            {"What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Lisbon"}, "Paris"},
            {"Who developed Java?", new String[]{"Microsoft", "Oracle", "Sun Microsystems", "Apple"}, "Sun Microsystems"},
            {"What is the largest planet in our solar system?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, "Jupiter"},
            {"Which country is the Eiffel Tower located in?", new String[]{"France", "Germany", "USA", "Spain"}, "France"},
            {"What is the square root of 64?", new String[]{"6", "8", "10", "12"}, "8"}
        };

        // Loop through the questions
        for (Object[] questionData : questions) {
            String questionText = (String) questionData[0];
            String[] options = (String[]) questionData[1];
            String correctAnswer = (String) questionData[2];

            boolean isCorrect = askQuestion(questionText, options, correctAnswer);
            if (isCorrect) {
                moneyWon += 50000; // Increase money for each correct answer
                System.out.println("Correct! You've won $" + moneyWon);
            } else {
                System.out.println("Incorrect answer. You won $" + moneyWon);
                break;
            }
        }

        System.out.println("Game Over! You won $" + moneyWon);
        saveResultToFile(playerName, moneyWon);
    }

    public static boolean askQuestion(String question, String[] options, String correctAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Your answer: ");
        String playerAnswer = scanner.nextLine().trim();

        return playerAnswer.equalsIgnoreCase(correctAnswer);
    }

    public static void saveResultToFile(String playerName, int moneyWon) {
        try {
            File file = new File("game_result.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write("Player: " + playerName + " won $" + moneyWon + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the result.");
        }
    }

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to the Millionaire Game!");
        System.out.println("Answer questions correctly to win money!");
    }
}
