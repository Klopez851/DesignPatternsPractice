package kl.practice.Behavioral.Iterator.Iterators;

import kl.practice.Behavioral.Iterator.Iterator;

import java.util.List;

public class ReversePlaylistIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int currentIndex = 1;

    public ReversePlaylistIterator(List<T> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentIndex <= items.size();
    }

    @Override
    public T getNext() {
        T item = items.get(items.size()-currentIndex);
        currentIndex++;
        return item;
    }
}
