/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DERRICK
 */
import java.util.Scanner;

public class subtraction {
    
    public static void main(String[] args) {
        // Generate two single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Ensure number1 is greater than or equal to number2
        if (number1 < number2) {
            // Swap numbers if necessary
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student for an answer
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        
        // Read the student's answer
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // Check if the answer is correct and display the result
        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }
    }
}
