import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = in.nextLine();
        int low =0;
        int high = s.length() - 1;
        boolean ispalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)){
                ispalindrome=false;
                System.err.println(s+" is not a palindrome");
            }
            System.out.println(s+" is  a palindrome");
            break;
        }
        low--;
        high++;
    }
}
