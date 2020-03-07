public class InvestementTesterFor {
public static void main(String[] args) {
    final double InitialBalance = 10000;
    final double rate = 5;
    final int years = 20;
    Investment invest = new Investment(InitialBalance, rate);
    invest.waitForYears(years);
    double balance = invest.getBalance();
    System.out.printf("The Balance after %d years is %.2f US Dollars.\n", years,balance);
    }
    
}
