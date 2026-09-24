package kl.practice.Behavioral.Iterator.Iterators;

import kl.practice.Behavioral.Iterator.Iterator;
import kl.practice.Behavioral.Iterator.Song;

import java.util.List;

public class ArtistIterator<T> implements Iterator<T> {
    private final List<Song> items;
    private final String desiredArtist;
    private int currentIndex = 0;

    public ArtistIterator(List<Song> items, String desiredArtist){
        this.items = items;
        this.desiredArtist = desiredArtist;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.size();
    }

    @Override
    public T getNext() {
        Song item = items.get(currentIndex);
        currentIndex++;
        if(!item.getArtist().equals(desiredArtist)){
            return null;
        }
        return (T) item;
    }
}
