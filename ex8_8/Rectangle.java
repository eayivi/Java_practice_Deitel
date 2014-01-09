import java.util.*;
import java.io.*;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle() {
    setLength (1.0);
    setWidth (1.0);
  }

  public void setLength( double rectLength ) {
    length = (rectLength > 0 && rectLength < 20.0 ? rectLength : 1.0 );
  }

  public void setWidth( double rectWidth ) {
    width = (rectWidth > 0 && rectWidth < 20.0 ? rectWidth : 1.0 );
  }
   
  public double getLength() {
    return length;
  }
  
  public double getWidth() {
    return width;
  }

  public double perimeter () {
    return 2 * width + 2 * length;
  }
    
  public double area() {
    return length * width;
  }

  public String toRectangleString() {
    return( "Length: " + length + "\n" + " Width: " + width + "\n"
            + " Perimeter: " + perimeter() + "\n" + " Area: " + area() );
  }

}
