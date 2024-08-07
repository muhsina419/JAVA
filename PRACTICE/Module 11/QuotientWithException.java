import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1 , int number2){
        if(number2 == 0){
            throw new ArithmeticException("Divisor cannot be zero ");
        }
        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two integers :");
        int number1 =in.nextInt();
        int number2  = in.nextInt();

        try{
            int result = quotient(number1, number2);
            System.out.println(number1+" / "+number2+" is = "+result);
        }

        catch(ArithmeticException ex){
            System.out.println("Exception  : An integer cannot be divided by Zero");
        }

        System.out.println("Execution continues ...");

        in.close();
    }
}
