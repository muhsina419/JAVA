/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s2.practice;

/**
 *
 * @author muhsi
 */
import java.util.Scanner;
public class ComputeAverage {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3) / 3;

        // Display result
        System.out.println("The average of " + number1 + " " + number2
         + " " + number3 + " is " + average);
    } 
}
        