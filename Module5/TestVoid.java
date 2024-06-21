public class TestVoid {
    public static void main(String[] args) {
        System.out.println("Your Grade is : \n");
        printGrade(95.5);
        System.out.println("   \n");
        System.out.println("the grade is "+getGrade(78.5)+"\n");
    }

    public static void printGrade(double s){
        if (s >= 90.0){
            System.out.println("A");
        }

        else if(s >= 80.0){
            System.out.println("B");
        }

        else if(s >= 70.0){
            System.out.println("C");
        }

        else if(s >= 60.0){
            System.out.println("D");
        }

        else{
            System.out.println("E");
        }
    }

    public static char getGrade(double score){
        if (score >= 90.0)
            return 'A';
        else if(score >= 80.0)
            return 'B';
        else if(score >= 70.0)
            return 'C';
        else if(score >= 60.0)
            return 'D';
        else
            return'E';    
    }
}
