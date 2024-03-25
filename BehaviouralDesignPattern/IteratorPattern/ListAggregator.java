package BehaviouralDesignPattern.IteratorPattern;

import java.util.List;

public class ListAggregator implements Aggregator {
    List<Integer> list;
    ListAggregator(List<Integer> list){
        this.list=list;
    }
    @Override
    public Iterator createIterator() {
        return new ListIterator(list);
    }
    
}
