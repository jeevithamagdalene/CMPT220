import java.util.Scanner;
public class LoopsDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the fatorial: ");
        int answer2 = sc.nextInt();
        int product = 1;
        //here's a hint
        for (int i = 1; i <= answer2; i++){
          product = product*i;

        }
        System.out.println(product);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int sum =0;
        //No hint! what do you need to complete this task?
        int answer3 = sc.nextInt();
        for (int j= 1; j< answer3; j+=2){

           sum = sum +j;
          
        }
        System.out.println(sum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        //after printing once , Need to set the run as fasle, to not to satisfy the condition on while loop
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;

        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        //hint
        sc.nextLine(); 
        System.out.print("Enter a string to reverse: ");
        String reverse = sc.nextLine();
        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.charAt(i));
    }

}
}