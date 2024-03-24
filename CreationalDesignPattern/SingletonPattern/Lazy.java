package CreationalDesignPattern.SingletonPattern;

public class Lazy {
    static Lazy lazy = null;

    Lazy() {

    }

    public static Lazy createInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}