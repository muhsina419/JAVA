 
public class SortRectangles {
    public static void main(String[] args) {
      ComparableRectangles[] rectangles = {
        new ComparableRectangles(3.4, 5.4), 
        new ComparableRectangles(13.24, 55.4),
        new ComparableRectangles(7.4, 35.4),
        new ComparableRectangles(1.4, 25.4)};
      java.util.Arrays.sort(rectangles);
      for (Rectangle rectangle: rectangles) {
        System.out.print(rectangle + " "); 
        System.out.println();
      }
    }
  }