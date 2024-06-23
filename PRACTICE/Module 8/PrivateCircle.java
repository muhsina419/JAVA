public class PrivateCircle {
    private double radius = 1;

    /** The number of the objects created */
    private static int numberOfObjects = 0;
  
    /** Construct a circle with radius 1 
     * @return */
    public void CircleWithPrivateDataFields() {
      numberOfObjects++;
    }
  
    /** Construct a circle with a specified radius */
    public void  CircleWithPrivateDataFields(double newRadius) {
      radius = newRadius;
      numberOfObjects++;
    }
  
    /** Return radius */
    public double getRadius() {
      return radius;
    }
  
    /** Set a new radius */
    public void setRadius(double newRadius) {
      radius = (newRadius >= 0) ? newRadius : 0;
    }
  
    /** Return numberOfObjects */
    public static int getNumberOfObjects() {
      return numberOfObjects;
    }
  
    /** Return the area of this circle */
    public double getArea() {
      return radius * radius * Math.PI;
    }  
}
