public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject obj1 = new Circle(5);
        GeometricObject obj2 = new Rectangle(2,5);

        System.out.println("The two objects have the same Area ?"+equalArea(obj1,obj2));

        displayGeometricObject(obj1);
        displayGeometricObject(obj2);

    }

    public static boolean equalArea(GeometricObject obj1 , GeometricObject obj2){
        return obj1.getArea() == obj2.getArea();
    }

    public static void displayGeometricObject(GeometricObject obj){
        System.out.println();
        System.out.println("The area is "+obj.getArea());
        System.out.println("The perimeter is "+obj.getPerimeter());
    }
}
