
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(
            for (int j = 0; j < myArray.length; j++) {
                boolean duplicates = false;
                int count = 1;
                
                for (int k = j + 1; k < myArray.length; k++) {
                    if (k != j && myArray[k] == myArray[j]) {
                        duplicates = true;
                        count++;
                    }
                }
                
                if (duplicates) {
                    System.out.println("Number " + myArray[j] + " appears " + count + " times");
                }
            }
        
    }
}
