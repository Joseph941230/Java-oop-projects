package bankaccountapp;



public class Checking extends Account{
    //List properties specific to a Checking account
    int debitCardNumber;
    int getDebitPinNumber;

    // Constructor to Checking account
    public Checking(String name,String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "1" + accountNumber;
       setDebitCard();


    }
    @Override
    public void setRate(){
       rate =  getBaseRate() * 0.15;
    }




    // List any methods specific to the checking account
   private void setDebitCard(){
       debitCardNumber = (int)(Math.random() * Math.pow(10,12));
       getDebitPinNumber = (int)(Math.random() * Math.pow(10,4));

   }


    public void showInfo(){

       System.out.println("ACCOUNT TYPE : CHECKING");
        super.showInfo();
        System.out.println("Your Checking Account Features: " +
                "\nDebit number is: " + debitCardNumber +
                "\nDebit PIN number is: " + getDebitPinNumber
                );
   }
}
