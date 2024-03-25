package BehaviouralDesignPattern.IteratorPattern;

import java.util.Stack;

public class StackIterator implements Iterator {
    Stack<Integer> stack;
    int index;

    StackIterator(Stack<Integer> stack) {
        this.stack = stack;
        this.index = stack.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return stack.get(index--);
        }
        return null;
    }

}
