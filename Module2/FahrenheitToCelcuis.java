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
public class FahrenheitToCelcuis {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the degree in Fahrenheit : ");
        double Fahrenheit=in.nextDouble();
        double celcuis= (5.0/9)* (Fahrenheit-32);
        System.out.println(Fahrenheit+" Fahrenheit is "+celcuis+" celcuis ");
    }
}
