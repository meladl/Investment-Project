public class Investment {
   public Investment(double aBalance, double aRate){
       balance = aBalance;
       rate = aRate;
       years = 0;
   } 
   public void waitForBalance(double targetBalance){
       while (balance < targetBalance){
       years ++;
       double interest = balance * rate/100;
       balance = balance + interest;
   }
   }
   public void waitForYears(int n){
       for ( int i = 1;i <= n; i++ ){
           double interest = balance * rate/100;
       balance = balance + interest;
       }
       years = years + n;
   }
   public double getBalance(){
       return balance;
   }
   public int getYears(){
       return years;   
   }
   private double balance;
   private double rate;
   private int years;
}
