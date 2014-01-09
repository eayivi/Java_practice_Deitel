import java.util.*;
public class ArrayListCollection {
  public static void main (String [] args) {
    ArrayList< String > items = new ArrayList <String>();
    items.add("red");
    items.add(0, "yellow");
  
    System.out.print("Content of our arrayList:");
    for (int i=0; i<items.size(); i++) {
      System.out.printf(" %s", items.get(i));
    }
    
    display(items, "Display List content with enhanced for-loop");    
    
    items.add("green");
    items.add("yellow");
    display(items, "List with two new elements");
  
    items.remove("yellow");
    display(items, "Remove first instance of yellow");  
    
    items.remove(1);
    display(items, "Remove item at second index");
    
    System.out.printf("\"red\" is%s in the list", (items.contains("red") ? "": " not") );
  }



  public static void display(ArrayList<String> items, String description) {
    System.out.printf("\n%s: ", description);
    
    for (String value : items) {
      System.out.printf ("%s ", value);
    }
  }
}
