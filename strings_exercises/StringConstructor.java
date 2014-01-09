// seize point un
public class StringConstructor {
  public static void main( String[] args) {
    char[] charArray = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
    String s = new String( "Hello" );
    
    // using String constructor
    String s1 = new String();
    String s2 = new String( s );
    String s3 = new String( charArray );
    String s4 = new String( charArray, 6, 3 );
   
    int c =3; 
      System.out.println( c );
    System.out.printf( "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s", s1, s2, s3, s4 );
  }
}
