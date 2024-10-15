
import java.util.Scanner;
import java.util.Random;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] values = {1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000, 2000000};

        // Randomly shuffle the values array
        for (int i = values.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = values[index];
            values[index] = values[i];
            values[i] = temp;
        }
        
        int playerCaseIndex;
        while (true) {
            System.out.println("Select your case (1-26):");
            playerCaseIndex = scanner.nextInt();
            if (playerCaseIndex >= 1 && playerCaseIndex <= 26) {
                playerCaseIndex--; // Adjust for 0-based index
                break;
            } else {
                System.out.println("Invalid selection. Please choose a number between 1 and 26.");
            }
        }
        int playerValue = values[playerCaseIndex];

        int roundsPlayed = 0;
        int casesLeft = 25; // Excluding player's case

        while (casesLeft > 1) { 
            roundsPlayed++;
            int casesToOpen;
            if (casesLeft > 20) casesToOpen = 6;
            else if (casesLeft > 15) casesToOpen = 5;
            else if (casesLeft > 11) casesToOpen = 4;
            else if (casesLeft > 8) casesToOpen = 3;
            else if (casesLeft > 6) casesToOpen = 2;
            else casesToOpen = 1;

            System.out.println("\nRound " + roundsPlayed + ": Open " + casesToOpen + " case(s)");
            
            for (int i = 0; i < casesToOpen && casesLeft > 1; i++) { 
                System.out.println("Select a case to open from the following unopened cases:");
                for (int j = 0; j < values.length; j++) {
                    if (values[j] != 0 && j != playerCaseIndex) {
                        System.out.print((j + 1) + " ");
                    }
                }
                System.out.println();

                int openCase;
                while (true) {
                    openCase = scanner.nextInt() - 1;
                    if (openCase >= 0 && openCase < 26 && openCase != playerCaseIndex && values[openCase] != 0) {
                        break;
                    } else {
                        System.out.println("Invalid selection. Please choose an unopened case:");
                    }
                } 

                System.out.println("Case " + (openCase + 1) + " contains: $" + values[openCase]);
                values[openCase] = 0; // Mark as opened
                casesLeft--;
            }

            // Banker's offer
            if (casesLeft > 1) {
                int sum = 0;
                int count = 0;
                for (int value : values) {
                    if (value != 0) {
                        sum += value;
                        count++;
                    }
                }
                int offer = sum / count;  // Simple average for the banker's offer

                System.out.println("Banker's offer: $" + offer);
                System.out.println("Deal or No Deal? (1 for Deal, 0 for No Deal)");
                int decision = scanner.nextInt();
                if (decision == 1) {
                    System.out.println("You won $" + offer + "!");
                    return;
                }
            }
        }

        // Last case scenario
        int lastCaseNumber = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != 0 && i != playerCaseIndex) {
                lastCaseNumber = i + 1;  // +1 to convert from 0-based index to 1-based case number
                break;
            }
        }

        System.out.println("One case left! You have two options:");
        System.out.println("1. Keep your initial case (Case " + (playerCaseIndex + 1) + ")");
        System.out.println("2. Switch to the last unopened case (Case " + lastCaseNumber + ")");
        System.out.println("Enter 1 to keep your case or 2 to switch:");

        int finalDecision = scanner.nextInt();

        int finalCaseValue;
        int otherCaseValue;

        if (finalDecision == 1) {
            finalCaseValue = playerValue;
            otherCaseValue = values[lastCaseNumber - 1];
            System.out.println("You decided to keep your initial case (Case " + (playerCaseIndex + 1) + ")");
        } else {
            finalCaseValue = values[lastCaseNumber - 1];
            otherCaseValue = playerValue;
            System.out.println("You decided to switch to Case " + lastCaseNumber);
        }

        System.out.println("You Won!!: $" + finalCaseValue);
        System.out.println("The Unopened case contained: $" + otherCaseValue);
    }
}