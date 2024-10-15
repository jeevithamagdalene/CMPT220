
import java.util.Scanner;
import java.util.Random;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] values = {1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000, 2000000};

        // To make the Random values for each boxes
       
        for (int i = values.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = values[index];
            values[index] = values[i];
            values[i] = temp;
        }
        //Chosing the palyers Intial Box, and Throw error for Invalid selection (i,e. The selection should be from 1 to 26)
        int playerCaseIndex;
        while (true) {
            System.out.println("Select your case (1-26):");
            playerCaseIndex = scanner.nextInt();
            if (playerCaseIndex >= 1 && playerCaseIndex <= 26) {
                //To reduce the selection -1 so that to mathch the array index of the above array, Since array starts from 0
                playerCaseIndex--; 
                break;
            } else {
                System.out.println("Invalid selection. Please choose a number between 1 and 26.");
            }
        }
        //Retriving the value of the boxes by the index of the array
        int playerValue = values[playerCaseIndex];
      
        int roundsPlayed = 0;
        int casesLeft = 25; 

        while (casesLeft > 1) { 
            //This is inceremented to shouw the users the round in which they are playing
            roundsPlayed++;
            int casesToOpen;
            if (casesLeft > 20) casesToOpen = 6;
            else if (casesLeft > 15) casesToOpen = 5;
            else if (casesLeft > 11) casesToOpen = 4;
            else if (casesLeft > 8) casesToOpen = 3;
            else if (casesLeft > 6) casesToOpen = 2;
            else casesToOpen = 1;

            System.out.println("Round " + roundsPlayed + ": Open " + casesToOpen + " cases");
            // To show the users the unpoened cases left, So that the users can pick from that list
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
                    //If the users chose number below 1 and 26, and chose the Initial chosed box and if the value of the chosen Box is 0(which mean the case is already opened)
                    //Need to choose again
                    if (openCase >= 0 && openCase < 26 && openCase != playerCaseIndex && values[openCase] != 0) {
                        break;
                    } else {
                        System.out.println("Invalid selection. Please choose an unopened case:");
                    }
                } 

                System.out.println("Case " + (openCase + 1) + " contains: $" + values[openCase]);
                //This is to make sure after opening the boxes, the value of the same is replaced as 0 in the values array
                values[openCase] = 0; 
                casesLeft--;
            }

          // Bankers' Scenario
            if (casesLeft > 1) {
                int sum = 0;
                int count = 0;
                for (int value : values) {
                    if (value != 0) {
                        sum += value;
                        count++;
                    }
                }
                int offer = sum / count;  

                System.out.println("Banker's offer: $" + offer);
                System.out.println("Deal or No Deal? (1 for Deal, 0 for No Deal)");
                int decision = scanner.nextInt();
                if (decision == 1) {
                    System.out.println("You won $" + offer + "!");
                    return;
                }
            }
        }
//This logic is the last Box scenrio.
      
        int lastCaseNumber = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != 0 && i != playerCaseIndex) {
                lastCaseNumber = i + 1;  
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