package CreationalDesignPattern.AbstractFactoryPattern;
public class OrdinaryVehicleFactory {
    public OrdinaryVehicle createInstance(String name) {
        OrdinaryVehicle vehicle = null;
        switch (name) {
            case "HYNDAI":
                vehicle = new Hyndai();
                break;
            case "MARUTI":
                vehicle = new Maruti();
                break;
            default:
                break;
        }
        return vehicle;
    }
    
}