public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Before creating objects :");
        System.out.println("The number of Circles :"+Circle.numberOfObjects);

        Circle c1 = new Circle();

        System.out.println("\n After creating circle 1");
        System.out.println("Circle 1 radius = "+c1.radius+" and no.of circle objects = "+c1.numberOfObjects);

        Circle c2 = new Circle(5);

        c1.radius = 9 ;

        System.out.println("\n After Creating circle 2 and modifying circle 1");
        System.out.println("c1: radius (" + c1.radius +
      ") and number of Circle objects (" +
      c1.numberOfObjects + ")");
    System.out.println("c2: radius (" + c2.radius +
      ") and number of Circle objects (" +
      c2.numberOfObjects + ")");
    }
}
