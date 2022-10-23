package bankaccountapp;


public abstract class Account implements IBaseRate{
    // list commet properity
    String name;
    String sSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;


    //Constructor to set base properties ans initialize the acount
    public Account(String name,String sSN,double initDeposit){
       this.name = name;
       this.sSN = sSN;
        balance = initDeposit;
       // System.out.println("Name: " + name + " SSN: " + sSN + " Balance: $" + balance);
  // Set account number
        index++;
        this.accountNumber = setAccountNumber();
       setRate();

    }
    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math. pow(10,3));
        return lastTwoSSN + uniqueID + randomNumber;
    }


    //List comment method
    public void deposit(double amount){
        balance = balance + amount;
    }


    public void withdraw(double amount){
        balance = balance - amount;
    }


    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("TRANSFER $" + amount + " to " + toWhere);
    }






 public void showInfo(){
     System.out.println(

             "Name: " + name +
                     "\nACCOUNT NUMBER: " + accountNumber +
                     "\nBALANCE: $" +balance +
                     "\nRATE: %" + rate
     );
 }
}
