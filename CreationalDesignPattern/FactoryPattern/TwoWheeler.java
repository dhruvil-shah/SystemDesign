package CreationalDesignPattern.FactoryPattern;

public class TwoWheeler implements Vehicle {
    TwoWheeler(){

    }
    @Override
    public void calculateFuelCapacity() {
        System.out.println("Fuel of 2 Wheeler");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine Started for 2 wheeler");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped for 2 wheeler");
    }

    
}