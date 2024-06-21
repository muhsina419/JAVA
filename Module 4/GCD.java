import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1=in.nextInt();
        System.out.println("Enter the Second number  :");
        int n2=in.nextInt();

        int gcd=1;
        int k=2;
        while (k <= n1 && k <= n2) {
            if (n1%k==0 && n2%k==0) {
                gcd=k;
            }
            k++;
        }
        System.out.println("The GCD for "+n1+" and "+n2+" is "+gcd);
    }
}
