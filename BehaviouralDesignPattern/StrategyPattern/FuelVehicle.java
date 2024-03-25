package BehaviouralDesignPattern.StrategyPattern;

public class FuelVehicle implements CarOperation {

    @Override
    public void start() {
        System.out.println("Start Fuel based car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Fuel based car");
    }
    
}
