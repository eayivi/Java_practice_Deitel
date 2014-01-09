import java.io.*;
import java.util.*;

public class E7_14  {  // a application that calculate the prod of a series of elements passed as vargs
  

  public static void main (String [] args) {
    int product = 1;
    int value;
    for (String item : args) {
      value = Integer.parseInt(item);
      product *= value;
    }
    System.out.println ("The product of the entered value is: " + product); 
  }
    
}
