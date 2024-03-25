package BehaviouralDesignPattern.NullObjectPattern;

public class NullCarObject extends Car {
    @Override
    public void price() {
        System.out.println("Deafult");
    }
    @Override
    public void mileage() {
        System.out.println("Deafult");
    }
}
