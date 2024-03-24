package CreationalDesignPattern.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        Eager eager1 = Eager.createInstance();
        Eager eager2 = Eager.createInstance();
        System.out.println(eager1.hashCode() + " " + eager2.hashCode());

        DoubleLocking doubleLocking1 = DoubleLocking.createInstance();
        DoubleLocking doubleLocking2 = DoubleLocking.createInstance();
        System.out.println(doubleLocking1.hashCode() + " " + doubleLocking2.hashCode());

    }
}
