public class CustomExceptionTest {
    public static void main(String[] args) {
        try{
            new CustomException(5);
            new CustomException(-5);
            new CustomException(0);
        }
        catch(InvalidRadiusException ex){
            System.out.println(ex);
        }

        System.out.println("Number of objects created:"+CustomException.getNumberOfObjects());
    }
}

class CustomException{
    private double radius;

    private static int numberOfObjects = 0;

    public CustomException() throws InvalidRadiusException{
        this(1.0);
    }

    public CustomException(double newRadius) throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException{
        if(newRadius >= 0)
            radius= newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double findArea(){
        return radius*radius*3.14159;
    }
}
