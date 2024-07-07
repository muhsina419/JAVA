import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueInput = true ;


        do{
            try{
                System.out.print("Enter an integer :");
                int number=in.nextInt();

                System.out.println("The number entered is "+number);

                continueInput=false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. (" + 
                "Incorrect input: an integer is required)");
            in.nextLine();
            }
        }
        while(continueInput);
    }
}
