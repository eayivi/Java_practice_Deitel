public class EmployeeTest {
  public static void main( String[] args) {
    //Date birth = new Date(7, 24, 1949);
    Date hire = new Date ( 3, 12, 1998);
    
    Employee employee1 = new Employee( "Bob", "Blue", new Date(7, 24, 1949), hire);

    System.out.println( employee1 );
  }
}
