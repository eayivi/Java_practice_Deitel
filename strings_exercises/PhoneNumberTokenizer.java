import java.util.Scanner;

public class PhoneNumberTokenizer {
  public static void main( String[] args ) {
    Scanner in = new Scanner( System.in );
    
    System.out.println( "Enter the phone number to separate, as (123)555-1212:" );
    String s = in.nextLine();
  
    String[] number = s.split( "[\\(\\)-]");
    
    System.out.println( "The area code is: " + number[1]);
    System.out.println( "The prefix numbers is: " + number[2]);
    System.out.println( "The last four digit of the numer are: " + number[3]);
  }
}
