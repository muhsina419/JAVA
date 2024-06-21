public class Increment {
    public static void main(String[] args) {
        int x= 1;
        System.out.println("Before the call "+x);
        postincrement(x);
        System.out.println("After the call "+x);
    }

    public static void postincrement(int n){
        n++;
        System.out.println("value of n inside the method is :"+n);
    }
}
