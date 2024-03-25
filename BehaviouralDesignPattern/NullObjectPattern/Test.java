package BehaviouralDesignPattern.NullObjectPattern;

public class Test {
    public static void main(String[] args) {
        Car toyata = Car.createInstance("Toyata");
        Car maruti = Car.createInstance("Maruti");
        Car tata = Car.createInstance("Tata");
        
        toyata.price();
        maruti.price();
        tata.price();

        
    }
}
