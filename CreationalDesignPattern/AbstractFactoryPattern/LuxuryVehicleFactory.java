package CreationalDesignPattern.AbstractFactoryPattern;

public class LuxuryVehicleFactory {
    public LuxuryVehice createInstance(String name) {
        LuxuryVehice vehicle = null;
        switch (name) {
            case "BMW":
                vehicle = new BMW();
                break;
            case "AUDI":
                vehicle = new Audi();
                break;
            default:
                break;
        }
        return vehicle;
    }
}
