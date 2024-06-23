import java.util.Scanner;
public class TestBoolean {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a integer Number :");
        int num = in.nextInt();
        if(num%2==0 && num%3==0)
            System.out.println(num+" Number is divisible by 2 and 3 ");
        if(num%2==0 || num%3==0)
            System.out.println(num+" Number is divisible by 2 or 3 ");
        if(num%2==0 ^ num%3==0)
            System.out.println(num+" Number is divisible by 2 or 3. \n Not by Both");
    }
}
