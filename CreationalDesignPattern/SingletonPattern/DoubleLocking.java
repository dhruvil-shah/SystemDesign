package CreationalDesignPattern.SingletonPattern;

public class DoubleLocking {
    static DoubleLocking doubleLocking = null;

    DoubleLocking() {

    }

    public static DoubleLocking createInstance() {
        if (doubleLocking == null) {
            synchronized (DoubleLocking.class) {
                if (doubleLocking == null) {
                    doubleLocking = new DoubleLocking();
                }
            }
        }
        return doubleLocking;
    }
}
