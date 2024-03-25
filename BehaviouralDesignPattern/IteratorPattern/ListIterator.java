package BehaviouralDesignPattern.IteratorPattern;

import java.util.List;

public class ListIterator implements Iterator {
    List<Integer> list;
    int index;

    public ListIterator(List<Integer> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(index++);
        }
        return null;
    }

}
