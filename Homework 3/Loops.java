/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //Step1: The scanner allows me to take the input from the user in the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Word:");
     //Step 2: This take the string input from the user and store it in a variable
        String answer1 = scanner.nextLine();  
    //Step 3: For loop to iterate each letter from the word. Starting from the 0th index(1st letter) till the 
    //last word. To find the last word,  need to take length of the word by using the length function
    //Need to iterate from the 0th index of the word until length-1 times to get the full word.
    
        for (int i = 0; i <  answer1.length(); i++) { 
            // Step 4: answer1.charAt(i) is used to get the character at index i in the string.
            System.out.println(answer1.charAt(i));
        }
    

    }
}
