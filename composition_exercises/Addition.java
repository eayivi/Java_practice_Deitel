// 14 point 2
import javax.swing.JOptionPane;

public class Addition {
  public static void main( String[] args ) {
    // obtain user input from JOptionPane
    String firstNumber = JOptionPane.showInputDialog( "Enter first integer" );
    String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

    //convert to int
    int number1 = Integer.parseInt( firstNumber );
    int number2 = Integer.parseInt( secondNumber );

    int sum = number1 + number2;

    // Display results in OptionPane window
    JOptionPane.showMessageDialog( null, "The sum is " + sum, "sum of Two integers", JOptionPane.ERROR_MESSAGE ); 
  }
}
