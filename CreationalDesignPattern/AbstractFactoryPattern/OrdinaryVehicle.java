package CreationalDesignPattern.AbstractFactoryPattern;

public class OrdinaryVehicle implements Vehicle {

    @Override
    public void priceRange() {
        System.out.println("Moderate");
    }

    @Override
    public void engineQuality() {
        System.out.println("3/5");
    }
    public void getName(){
        
    }
}
