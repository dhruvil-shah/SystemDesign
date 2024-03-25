package BehaviouralDesignPattern.NullObjectPattern;

public abstract class Car {
    public abstract void price();
    public abstract void mileage();
    public static Car createInstance(String companyName){
        Car car;
        switch (companyName) {
            case "Toyata":        
                car = new Toyata();
                break;
            case "Maruti":
                car = new Maruti();
                break;
            default:
                car = new NullCarObject();
                break;
        }
        return car;
    }
} 
