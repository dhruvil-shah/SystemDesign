package BehaviouralDesignPattern.TemplateMethodPattern;

public abstract class Template {
    public abstract void func1();
    public abstract void func2();
    public abstract void func3();
    public abstract void func4();
    public void executeFunctionInOrder(){
        func1();
        func2();
        func3();
        func4();
    }
}
