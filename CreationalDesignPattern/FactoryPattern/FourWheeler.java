package CreationalDesignPattern.FactoryPattern;

public class FourWheeler implements Vehicle {
    FourWheeler(){

    }
    @Override
    public void calculateFuelCapacity() {
        System.out.println("Fuel of 4 Wheeler");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine Started for 4 wheeler");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped for 4 wheeler");
    }
    
}
