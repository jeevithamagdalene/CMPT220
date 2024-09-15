//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        System.out.println("Q1: What is the Capital of Inida? ");
        String answer1 = sc.nextLine();
        if(answer1.equals("Delhi"))
        {
            System.out.println("It is Right Answer !");
            a++;
        }
        else if(answer1.equals("delhi"))
        {
            System.out.println("It is Right Answer !");
            a++;
        }
        else if(answer1.equals("DELHI"))
        {
            System.out.println("It is Right Answer !");
            a++;
        }
        else
        {
            System.out.println("It is wrong Answer !");
        }
            
       System.out.println("Q2: What is 2+2? ");
       int answer2 = sc.nextInt();
       if(answer2 == 4)
        {
            System.out.println("It is Right Answer !");
            a++;
        }
        else{
            System.out.println("It is wrong Answer !");
        }

       System.out.println("Q2: Tell me any even Number? ");
        int answer3 = sc.nextInt();

        if (answer3 == 0)
        {
            System.out.println("0 is neither and even or Odd Number, So Its a Wrong answer !");
        }
        else if(answer3 % 2 == 0 ){
            System.out.println("It is Right Answer !");
            a++;
        }
        else{
            System.out.println("It is wrong Answer !");
        }

        System.out.println("Your Score is : " + a);
    }
   
    

   
}


