// Online Java Compiler
// Use this editor to write, compile and run your Java code online


public class Debug {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println(var1+ " is greater than 4");
        }
        else if(var1 ==4){
            System.out.println(var1 + " is 4");
        }
         else{
            System.out.println(var1 + " is less than 4");
        }

        int var2 = 6;
        if (var2 == 5){
            System.out.println(var2 + " is 5");
        } else if (var2 > 5){
            System.out.println(var2 + " is greater than 5");
        } else if (var2 < 5){
            System.out.println(var2 + " is less than 5");
        } else{
            System.out.println( var2 + " is 6");
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println(var3 + " is greater than 10");
        } else {
            System.out.println(var3 + " is less than 10");
        }

        //for this section: why are we not entering the if statement?
        //Because capitalization matters in Java!! since the first letter of "Marist" is different(one is captilized and another is small),
        //therefore it didn't pass the if statement
        if ("Marist" == "marist"){
        
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}
