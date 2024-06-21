public class Overloading {
    public static void main(String[] args){
        System.out.println("The maximum of 3.0 and 5.4 is "+max(3.0,5.4));
        System.out.println("The maximum of 3.0 ,10.8 and 5.4 is "+max(3.0,5.4,10.8));
        System.out.println("The maximum of 3 and 5 is "+max(3,5));
    } 
    public static int max(int num1, int num2) {
    if (num1 > num2)
      return num1;
    else
      return num2;
  }

  /** Find the max of two double values */
  public static double max(double num1, double num2) {
    if (num1 > num2)
      return num1;
    else
      return num2;
  }

  /** Return the max of three double values */
  public static double max(double num1, double num2, double num3) {
    return max(max(num1, num2), num3);
  }
}
