package BehaviouralDesignPattern.StrategyPattern;

public class FourWheeler {
    CarOperation carOperation;
    public void noOfWheels(){
        System.out.println("I have 4 wheels");
    }
    public void setCarOperation(CarOperation carOperation) {
        this.carOperation = carOperation;
    }
    
}
