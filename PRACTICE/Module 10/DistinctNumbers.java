import java.util.ArrayList;
import java.util.Scanner;

public record DistinctNumbers() {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0) : ");
        int value;

        do{
            value = in.nextInt();

            if(!list.contains(value)&&value!=0){
                list.add(value);
            }
        }while(value != 0);

        System.out.println("The distinct integers are : ");
        for(int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
    }
}
