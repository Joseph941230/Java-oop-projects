package bankaccountapp;

public class Savings extends Account {
    //List properties specific to a Savings account
   int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to Checking account
    public Savings(String name,String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
       setSafetyDepositBox();

    }
    @Override
    public void setRate(){
        rate =  getBaseRate() - .25;
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }


    // List any methods specific to the checking account
    public void showInfo(){

        System.out.println("ACCOUNT TYPE : SAVING");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit BOx ID: " +safetyDepositBoxID +
                        "\n Safty Deposit Box Key: " + safetyDepositBoxKey



        );

    }
}
