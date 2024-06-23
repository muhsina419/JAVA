import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = (int)(Math.random()*101);

        int guess =-1;
        while (guess != num) {
            System.out.println("Enter your guess :");
            guess=in.nextInt();

            if (guess == num) 
                System.out.println("You guessed Correctly!");
            else if (guess > num) 
               System.out.println("Your guess is too high ");
            else
                System.out.println("Your guess is too low ");

        }
    }
}
