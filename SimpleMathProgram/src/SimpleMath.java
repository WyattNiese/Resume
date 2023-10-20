/**
 * This program will ask the user to input 2 numbers then the program will complete multiple calculations to those
 * numbers and output the results while also outputting the average.
 * @author WyattNiese
 * @version 08272023
 **/
import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + number1 * number2);
        System.out.println(number1 + " / " + number2 + " = " + number1 / number2); 
        System.out.println(number1 + " % " + number2 + " = " + number1 % number2);
        System.out.println("The average of your two numbers is: " + (number1 + number2) /2);
        
    }
}