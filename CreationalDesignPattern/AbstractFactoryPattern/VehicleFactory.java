package CreationalDesignPattern.AbstractFactoryPattern;

public class VehicleFactory {
    public Vehicle createInstance(String name) {
        Vehicle vehicle = null;
        switch (name) {
            case "LUXURY":
                vehicle = new LuxuryVehice();
                break;
            case "ORDINARY":
                vehicle = new OrdinaryVehicle();
                break;
            default:
                break;
        }
        return vehicle;
    }
}
