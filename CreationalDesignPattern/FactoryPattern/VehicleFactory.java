package CreationalDesignPattern.FactoryPattern;

public class VehicleFactory {
    VehicleFactory(){

    }
    public Vehicle createInstance(String type) {
        Vehicle vehicle = null;
        switch (type) {
            case "TWO":
                vehicle = new TwoWheeler();
                break;
            case "FOUR":
                vehicle = new FourWheeler();
                break;
            default:
                break;
        }
        return vehicle;
    }
}
