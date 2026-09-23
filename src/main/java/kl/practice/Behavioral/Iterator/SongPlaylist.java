package kl.practice.Behavioral.Iterator;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class SongPlaylist<T> implements Playlist<T>{
    private List<T> songs = new ArrayList<>();

    public void addItem(T item){
        songs.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new PlaylistIterator<T>(songs);
    }

    @Override
    public Iterator<T> createReverseIterator() {
        return new ReversePlaylistIterator<T>(songs);
    }

    @Override
    public Iterator<T> createArtistIterator() {
        return new ArtistIterator<T>((List<Song>) songs, "Artist A");
    }

}
