package kl.practice.Behavioral.Iterator.Iterators;


import kl.practice.Behavioral.Iterator.Iterator;

import java.util.List;


public class PlaylistIterator<T> implements Iterator<T> {
    private final List<T> songs;
    private int currentIndex= 0;

    public PlaylistIterator(List<T> songs){
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        if(currentIndex < songs.size()){
            return true;
        }
        return false;
    }

    @Override
    public T getNext() {
        T song = songs.get(currentIndex);
        currentIndex++;
        return song;
    }
}
