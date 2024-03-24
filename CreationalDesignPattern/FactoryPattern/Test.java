package CreationalDesignPattern.FactoryPattern;
public class Test {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle twoWheeler = vehicleFactory.createInstance("TWO");
        Vehicle fourWheeler = vehicleFactory.createInstance("FOUR");
        twoWheeler.calculateFuelCapacity();
        twoWheeler.startEngine();
        twoWheeler.stopEngine();

        fourWheeler.calculateFuelCapacity();
        fourWheeler.startEngine();
        fourWheeler.stopEngine();
    }
}
