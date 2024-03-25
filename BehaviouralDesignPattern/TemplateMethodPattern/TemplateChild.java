package BehaviouralDesignPattern.TemplateMethodPattern;

public class TemplateChild extends Template {

    @Override
    public void func1() {
        System.out.println("Function 1");
    }

    @Override
    public void func2() {
        System.out.println("Function 2");
    }

    @Override
    public void func3() {
        System.out.println("Function 3");
    }

    @Override
    public void func4() {
        System.out.println("Function 4");
    }
    
}
