import java.util.Scanner;
public class Substraction {
    public static void main(String[] args){
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("What is "+num1+" - "+num2+" ? ");
        Scanner in = new 
        Scanner (System.in);
        int ans = in.nextInt();
        if(num1-num2 == ans ){
            System.out.print("You are Correct ");
        }
        else{
            System.out.println("Your Answer is Wrong ");
            System.out.println(num1+" - "+num2+" = "+(int)(num1-num2));
        }
    }
    
}
