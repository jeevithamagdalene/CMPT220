/*
for this problem you need to:
1. create 5 different students in your main
2. create a method in this file that returns if they're an honor roll student or not (gpa > 3.6) then
check each of the students in main
3. create a method to see if they get "free lunch" (this is a weird school, every day they generate a random student id
and see if any students match that id, if they do they get free lunch that day, yay!) compare a randomly generated id and the
id of the student to print the appropriate response.
 */
import java.util.Random;

public class student{
    String name;
    String year;
    double gpa;
    int id;
    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;

    }

       //new method
     String getHonor(){
        if(gpa >3.6){
            return name + " is an honor roll";
        }
        else{
            return name + " is Not an honor roll";
        }
     }

    //new methods
    String freeLunch(){
        Random random = new Random();
        int randomId = random.nextInt(5) + 1;
        if(id == randomId){
            return name+ " Gets Free Lunch";
        }
        else{
            return name+ " Dosen't gets Free Lunch";
        }
        }
    }


