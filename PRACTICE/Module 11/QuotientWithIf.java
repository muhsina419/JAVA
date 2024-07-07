import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two integers :");
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        if(number2 != 0){
            System.out.println(number1+" / "+number2+" is "+(number1/number2));
        }
        else{
            System.out.println("Divisor cannot be zero ");
        }
    in.close();
    }
}
