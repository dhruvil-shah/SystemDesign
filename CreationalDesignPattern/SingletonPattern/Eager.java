package CreationalDesignPattern.SingletonPattern;

public class Eager {
    static Eager eager = new Eager();
    Eager(){

    }
    public static Eager createInstance(){
        return eager;
    }
}
