package CreationalDesignPattern.AbstractFactoryPattern;


public class Test {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        LuxuryVehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
        OrdinaryVehicleFactory ordinaryVehicleFactory = new OrdinaryVehicleFactory();
        Vehicle luxuryVehicle = vehicleFactory.createInstance("LUXURY");
        Vehicle ordinaVehicle = vehicleFactory.createInstance("ORDINARY");

        luxuryVehicle.engineQuality();
        luxuryVehicle.priceRange();

        ordinaVehicle.engineQuality();
        ordinaVehicle.priceRange();

        LuxuryVehice bmwVehicle = luxuryVehicleFactory.createInstance("BMW");
        OrdinaryVehicle marutiVehicle = ordinaryVehicleFactory.createInstance("MARUTI");

        bmwVehicle.getName();
        marutiVehicle.getName();

    }
}
