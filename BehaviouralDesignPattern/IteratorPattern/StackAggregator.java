package BehaviouralDesignPattern.IteratorPattern;

import java.util.Stack;

public class StackAggregator implements Aggregator {
    Stack<Integer> stack;

    StackAggregator(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public Iterator createIterator() {
        return new StackIterator(stack);
    }
}
