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
public class ComputeAreaUser {
    
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double radius;
            double area;
            
            System.out.println("Enter the radius of the circle : ");
            radius= scanner.nextDouble();
            area=radius*radius*3.14;
            System.out.println("The area of the circle of radius "+radius+" is : "+area);
    }
    
}

