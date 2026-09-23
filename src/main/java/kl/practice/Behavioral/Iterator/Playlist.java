package kl.practice.Behavioral.Iterator;

public interface Playlist<T> {
    Iterator<T> createIterator();
    Iterator<T> createReverseIterator();
    Iterator<T> createArtistIterator();
    void addItem(T item);
}
