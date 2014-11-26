package Chapter07;

import java.util.Scanner;


public class Comparisons {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
            
        String inputOne;
        String inputTwo;
        String inputThree;
        
        int intOne;
        int intTwo;
        int intThree;
        
        Comparable largest;
        Comparable largestInt;
        
        System.out.println("Please type first word: ");
        inputOne = scan.nextLine();
        System.out.println("Please type second word: ");
        inputTwo = scan.nextLine();
        System.out.println("Please type third word: ");
        inputThree = scan.nextLine();
        
        largest = Compare3.largest(inputOne, inputTwo, inputThree);
        
        System.out.println("The largest input is: " + largest);
        
        // Check integers
        System.out.println("\n\nPlease type first integer: ");
        intOne = scan.nextInt();
        System.out.println("Please type second integer: ");
        intTwo = scan.nextInt();
        System.out.println("Please type third integer: ");
        intThree = scan.nextInt();
        
        largest = Compare3.largest(intOne, intTwo, intThree);
        
        System.out.println("The largest integer is: " + largest);
        
        
    }

}
