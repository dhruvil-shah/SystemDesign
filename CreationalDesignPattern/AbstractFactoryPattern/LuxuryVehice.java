package CreationalDesignPattern.AbstractFactoryPattern;

public class LuxuryVehice implements Vehicle {

    @Override
    public void priceRange() {
        System.out.println("Very High");
    }
    @Override
    public void engineQuality() {
        System.out.println("5/5");
    }
    public void getName(){
        
    }
}
