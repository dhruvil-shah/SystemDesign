package BehaviouralDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        ListAggregator listAggregator = new ListAggregator(list);
        StackAggregator stackAggregator = new StackAggregator(stack);

        Iterator lIterator = listAggregator.createIterator();
        Iterator sIterator = stackAggregator.createIterator();

        System.out.println(lIterator.next());
        System.out.println(lIterator.next());

        System.out.println(sIterator.next());
        System.out.println(sIterator.next());
    }

}
