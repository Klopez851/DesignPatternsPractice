package kl.practice.Behavioral.Iterator.Playlists;

import kl.practice.Behavioral.Iterator.Iterator;

public interface Playlist<T> {
    Iterator<T> createIterator();
    Iterator<T> createReverseIterator();
    Iterator<T> createArtistIterator();
    void addItem(T item);
}
