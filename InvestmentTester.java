
public class InvestmentTester {
public static void main(String[] args) {
  final double InitialBalance = 10000;
  final double rate = 5;
  Investment invest = new Investment(InitialBalance, rate);
  invest.waitForBalance(2 * InitialBalance);
  int years = invest.getYears();
  double balance = (int) invest.getBalance();
  System.out.println("The Investment doubled after " + years + " years.");
    System.out.println("The Balance after Investment of " + years + " is " + balance + " US Dollars.");
}
    
}
