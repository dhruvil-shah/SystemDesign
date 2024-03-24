package CreationalDesignPattern.SingletonPattern;

public class Synchronzied {
    static Synchronzied synchronzied = null;

    Synchronzied() {

    }

    public static synchronized Synchronzied createInstance() {
        if (synchronzied == null) {
            synchronzied = new Synchronzied();
        }
        return synchronzied;
    }
}