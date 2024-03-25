package BehaviouralDesignPattern.TemplateMethodPattern;

public class Test {
    public static void main(String[] args) {
        Template template = new TemplateChild();
        template.executeFunctionInOrder();
    }
}
