//    Build two constructors
//        1. One that accepts a CASH value
//        2. One that accepts a value in MILES
//    Build two  Methods
//        1. getCashValue()
//            a. returns the cash value of the RewardValue
//        2.getMilesValue()
//            a. returns the # of miles RewardValue is worth
//    Must convert from miles to cash at a rate of 0.0035

public class RewardValue {
    private double miles;
    private double cash;

    public RewardValue(double cashVal){
        this.cash = cashVal;
        this.miles = cashVal / 0.0035;
    }

    public double getMilesValue(){
        return miles;
    }

    public double getCashValue(){
        return cash;
    }


}