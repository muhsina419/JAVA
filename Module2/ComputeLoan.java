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
public class ComputeLoan {
    public static void main(String[] args ){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Yearly Interest rate :");
        double YearlyIR=in.nextDouble();
        double MonthlyIR= YearlyIR/1200;
        System.out.print("Enter number of Years :");
        int NoOfYears=in.nextInt();
        System.out.println("Enter the loan Amount : ");
        double loanAmount=in.nextDouble();
        double monthlyPayement=loanAmount * MonthlyIR / (1- 1 / Math.pow(1 + MonthlyIR, NoOfYears * 12));
        double totalPayement=monthlyPayement*NoOfYears*12;
        System.out.println("The Monthly Payement is :"+(int)(monthlyPayement*100)/100.0);
        System.out.println("The Total Payement is :"+(int)(totalPayement*100)/100.0);        
    }
}
