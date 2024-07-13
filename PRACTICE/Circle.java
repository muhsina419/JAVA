public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
    }

    public Circle (double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius( double radius){
        this.radius=radius;
    }

    @Override
    public double getArea(){
        return radius*radius*3.1415;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public void printCircle(){
        System.out.println("The Circle is Created "+getDateCreated()+"and the radius is "+radius);
    }
}

