import java.util.Scanner;

public class TestLoanClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter annual interest rate:");
        double annualInterestRate = in.nextDouble();

        System.out.println("Enter the number of years:");
        int numberOfYears = in.nextInt();

        System.out.println("Enter the loan amount:");
        double loanAmount = in.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s%n", loan.getLoanDate().toString());
        System.out.printf("Monthly Payment: %.2f%n", loan.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f%n", loan.getTotalPayment());
        
        in.close();
    }
}
