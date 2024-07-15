public class ComparableRectangles extends Rectangle implements Comparable<ComparableRectangles>{
    public ComparableRectangles(double width , double height){
        super(width,height);
    }

    @Override
    public int compareTo(ComparableRectangles o){
        if(getArea()>o.getArea()){
            return 1;
        }
        else if(getArea()<o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Width:"+getWidth()+" Height : "+getHeight()+" Area: "+getArea();
    }
}
