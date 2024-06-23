import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] list ,int key){
        int low=0;
        int high=list.length;

        while (high >= low){
            int mid =(low+high)/2;
            if (key < list[mid]){
                high = mid-1;
            }
            else if(key == list[mid]){
                return mid;
            }
            else{
                low=mid+1;
            }
        }
        return -low-1;
    }

    public static void main (String [] args ){
        Scanner in = new Scanner(System.in);
        int[] list = {-3,5,8,1,4,10};
        System.out.println("enter the number for search");
        int search = in.nextInt();
        System.out.println(binarySearch(list,search));
    }
}
