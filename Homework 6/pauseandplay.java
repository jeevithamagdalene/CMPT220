import java.util.Scanner;

public class pauseandplay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amy", "Tina","Mohana","Niral"};
        for(String i: friends){
            System.out.println(i);
        }
        for(int i=0;i< friends.length;i++){
            System.out.println(friends[i]);
        }
        System.out.println("Enter the grade");
        int grade = scanner.nextInt();

        switch (grade) {
            case 90:
            System.out.println("A"); 
            break;
            case 80:
            System.out.println("B"); 
            break;
            case 70:
            System.out.println("C"); 
            break;
            case 60:
            System.out.println("D"); 
            break;
            default:
            System.out.println("F"); 
                break;
        }
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
            case 10:
            System.out.println("Cannot Drink"); 
                break;
            case 20:
            System.out.println("Can Drink"); 
            break;
            case 30:
            case 40:
            case 50:
            case 60:
            case 70:
            case 80:
            case 90:
            System.out.println("Can Drink how much you want to Drink"); 
            break;
            default:
            System.out.println("Invalid Input"); 
                break;
         
          
           
        }
        int  number =100;
        System.out.println(number+=25);
        System.out.println(number-=25);
        System.out.println(number*=2);
        System.out.println(number/=5);
        int var = 21;
        String decision = (var < 21) ? ("Cannot Drink") :("Can Drink");
        System.out.println(decision);
    }
    
}
