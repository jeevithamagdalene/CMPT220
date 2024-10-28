/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();
    System.out.println("Problem 2");
    System.out.println("Enter a number and I will tell you the fatorial: ");
    int var2 = sc.nextInt();
    System.out.println("Factorial of the number is : " + factorial(var2));
    System.out.println("Problem 3");
      System.out.println("Enter a number and I will tell you the sum of every other number: ");
      int var5 = sc.nextInt();
      System.out.println("Sum of every other number: " + sum(var5));
      sc.nextLine();
      System.out.println("Problem 5");
      System.out.println("Enter a String to Reverse");
      String var7 = sc.nextLine();
      printReverse(var7);
      
    }

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }
    public static int factorial(int number){
        int var3 = 1;
        int var4;
        for(var4 = 1; var4 <= number; ++var4) {
            var3 *= var4;
         }
         return var3;
    }
    public static int sum(int number) {
        int total = 0;
        for (int i = 1; i < number; i += 2) { 
            total += i;
        }
        return total;
    }

    public static void printReverse(String input) {
        for (int i = input.length() - 1; i >= 0; --i) {
            System.out.print("Reversed String: " + input.charAt(i));
        }
    }
}




  

