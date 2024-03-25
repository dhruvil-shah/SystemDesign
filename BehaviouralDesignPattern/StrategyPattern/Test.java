package BehaviouralDesignPattern.StrategyPattern;

public class Test {
    public static void main(String[] args) {
        FourWheeler hyndaiVenue = new FourWheeler();
        hyndaiVenue.setCarOperation(new FuelVehicle());

        FourWheeler tataNexon = new FourWheeler();
        tataNexon.setCarOperation(new BatteryVehicle());

        hyndaiVenue.carOperation.start();
        hyndaiVenue.carOperation.stop();

        tataNexon.carOperation.start();
        tataNexon.carOperation.stop();
    }
}
