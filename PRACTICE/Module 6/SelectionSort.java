import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(double[] list){
        for(int i=0;i<list.length-1;i++){
            double currentmin = list[i];
            int currentMinIndex = i;

            for(int j =i+1 ;j<list.length;j++){
                if (currentmin >list[j]){
                    currentmin =list[j];
                    currentMinIndex= j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentmin;
            }
        }
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double[] list ={-2,4.5,5,1,2,-3.3,5.9};
        selectionSort(list);
        for(int i =0 ; i< list.length ;i++){
            System.out.println(list[i]+" ");
        }
    }
}
