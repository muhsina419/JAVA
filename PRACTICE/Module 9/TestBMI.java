public class TestBMI {
    public static void main(String[] args) {
        BMI bmi1 =new BMI("kiran kumar", 18, 50);
        System.out.println("The BMI for "+bmi1.getName()+" is "+bmi1.getBMI()+" "+bmi1.getStatus());
    }
}
