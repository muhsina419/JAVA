public class PassArray {
    public static void main(String[] args) {
        int[] a ={1,2};

        //Swap elements using swap method 
        System.out.println("Before invoking swap ");
        System.out.println("Array is {"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap ");
        System.out.println("array is {"+a[0]+","+a[1]+"}");

        
    }
}
