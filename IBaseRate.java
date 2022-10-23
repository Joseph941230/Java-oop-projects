package bankaccountapp;

public interface IBaseRate {

// wtoie a method that returns the base rate
    default double getBaseRate(){
        return 2.5;
    }

}
