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
public class SalesTax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the purchase Amount");
        double Amount=in.nextDouble();
        double tax= Amount*0.06;
        System.out.println("Tax for "+Amount+" is "+(int)(tax * 100) / 100.0);
    }
}
