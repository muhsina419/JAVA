import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS =5;
        int CorrectCount = 0;
        int Count = 0;
        long StartTime = System.currentTimeMillis();
        String output = " ";
        Scanner in = new Scanner(System.in);
        while (Count < NUMBER_OF_QUESTIONS) {
            int n1= (int)(Math.random()*10);
            int n2 = (int)(Math.random()*10);

            if (n1 < n2 ) {
                int temp = n1 ;
                n1 = n2;
                n2 = temp;
            }
            System.out.println("what is "+n1+" - "+n2+" ? ");
            int ans = in.nextInt();

            if(n1 - n2 == ans ){
                System.out.println("You are correct ! \n");
                CorrectCount++;
            }
            else{
                System.out.println("Your answer is wrong !!\n"+n1+" - "+n2+" should be "+(n1-n2)+"\n");
            }
            Count++;
            output+="\n"+n1+" - "+n2+" = "+ans+((n1-n2 == ans)? "correct ": "wrong");
        }
        long endTime =System.currentTimeMillis();
        long testTime = endTime-StartTime;

        System.out.println("Correct Count is "+CorrectCount+"\nTest Time is "+testTime/1000+"seconds\n"+output);
    }
}
