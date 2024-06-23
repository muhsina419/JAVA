import java.util.Scanner;

public class LinearSearch {
    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
      for (int i = 0; i < list.length; i++) {
        if (key == list[i])
          return i;
      }
      return -1;
    }
  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int[] list = {4, 5, 1, 2, 9, -3,100,9,10};
      System.out.println("enter the number for search");
      int search =in.nextInt();
      System.out.println(linearSearch(list,search));
    }
  }