package BehaviouralDesignPattern.StrategyPattern;

public class BatteryVehicle implements CarOperation {

    @Override
    public void start() {
        System.out.println("Start car through battery");
    }

    @Override
    public void stop() {
        System.out.println("Stop battery car");
    }
    
}
