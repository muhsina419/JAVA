import java.util.Scanner;

public class TestSwap {
     public static void main(String[] args) {
    // Declare and initialize variables
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int num1 = in.nextInt();
    System.out.println("Enter the second number :");
    int num2 = in.nextInt();
    // Invoke the swap method to attempt to swap two variables
    swap(num1, num2);

    System.out.println("After invoking the swap method, num1 is " +
      num1 + " and num2 is " + num2);
  }

  /** Swap two variables */
  public static void swap(int n1, int n2) {
    System.out.println("\tInside the swap method");
    System.out.println("\t\tBefore swapping, n1 is " + n1
      + " and n2 is " + n2);

    // Swap n1 with n2
    int temp = n1;
    n1 = n2;
    n2 = temp;

    System.out.println("\t\tAfter swapping, n1 is " + n1
      + " and n2 is " + n2);
  }
}
