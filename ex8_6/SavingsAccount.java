
public class SavingsAccount {
  private static double annualInterestRate = 0;
  private double savingsBalance;
 
  public SavingsAccount( double balance ) {
    savingsBalance = balance;
  }
  
  public double calculateMonthlyInterest () {
    double interest = savingsBalance * annualInterestRate /12.0;
    savingsBalance += interest;
    return interest;
  }

  public static void modifyInterestRate( double newRate ) {
    annualInterestRate = newRate ;
  }
  
}
