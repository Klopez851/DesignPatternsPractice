package kl.practice.Behavioral.Iterator;
/*
============================================================
ITERATOR DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a music player.

The music player has a Playlist containing Songs.

Create:

    Song
    Playlist

A Song should have at least:

    title
    artist

The Playlist should store multiple Songs.

However, you DON'T want the code using Playlist to know
how the songs are stored internally.

For example, the client should NOT need to know whether
Playlist uses:

    ArrayList
    LinkedList
    an array
    some custom data structure


YOUR TASK:

Implement the Iterator design pattern from scratch.

Create your own:

    Iterator<T> interface

with methods such as:

    hasNext()
    next()


Then create:

    PlaylistIterator

which is responsible for traversing the Playlist.

Your Playlist should provide a way to obtain an iterator:

    playlist.createIterator()


EXPECTED USAGE:

    Playlist playlist = new Playlist();

    playlist.addSong(new Song("Song A", "Artist A"));
    playlist.addSong(new Song("Song B", "Artist B"));
    playlist.addSong(new Song("Song C", "Artist C"));

    Iterator<Song> iterator = playlist.createIterator();

    while (iterator.hasNext()) {
        Song song = iterator.next();

        System.out.println(song.getTitle());
    }


IMPORTANT:

The client should NOT directly access the internal collection.

Avoid doing something like:

    playlist.getSongs()

and then iterating over that collection.

The whole point is that Playlist controls how its
contents are traversed.


Think about the responsibilities:

          Client
             |
             v
          Iterator
             |
             v
          Playlist
             |
             v
       Internal Collection


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. Why shouldn't the client simply access Playlist's
   internal list?

2. What information does the iterator need to keep track of?

3. Where should the current position/index be stored?

4. Should Playlist know about the iterator's current position?

5. What happens when next() is called after there are
   no more elements?

6. Who is responsible for traversal:

       Playlist
       Iterator
       Client

7. What would happen if Playlist changed from an ArrayList
   to a different data structure?

8. Would the client have to change?


============================================================
FOLLOW-UP EXERCISE 2 — MULTIPLE WAYS TO TRAVERSE
============================================================

Now extend your Playlist.

You want to support different ways of iterating through
the same collection.

Add a new iterator:

    ReversePlaylistIterator

The normal iterator should traverse:

    Song A
    Song B
    Song C
    Song D

The reverse iterator should traverse:

    Song D
    Song C
    Song B
    Song A


Your Playlist should be able to provide both:

    playlist.createIterator()

and:

    playlist.createReverseIterator()


EXPECTED USAGE:

    Iterator<Song> iterator =
        playlist.createReverseIterator();

    while (iterator.hasNext()) {
        Song song = iterator.next();

        System.out.println(song.getTitle());
    }


CONSTRAINTS:

1. Do NOT modify the client to deal with the internal
   collection.

2. Do NOT duplicate the Playlist itself just to support
   reverse iteration.

3. The traversal logic should live inside the iterator.

4. Both iterators should implement the same Iterator
   abstraction.

5. The Playlist should remain responsible for providing
   the appropriate iterator.


BONUS:

Add another iterator:

    ArtistIterator

It should iterate through the songs but only return songs
from a specific artist.

For example:

    ArtistIterator("Taylor Swift")

might produce:

    Song A - Taylor Swift
    Song C - Taylor Swift
    Song F - Taylor Swift


Think about how hasNext() needs to behave when you are
skipping elements that don't match.


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Iterator pattern solve?

2. Why is traversal logic separated from Playlist?

3. What does the Iterator object need to remember?

4. What does the Playlist need to know about the iterator?

5. Why is it useful to have multiple iterators for the same
   collection?

6. How does Iterator help hide implementation details?

7. What would change if Playlist switched from an ArrayList
   to another data structure?

8. Where might you see the Iterator pattern in real Java
   programs?

9. What's the difference between:

       Iterable
       Iterator

   in Java?

10. Why does Java's enhanced for-loop work with objects that
    implement Iterable?


============================================================
*/
public class main {
    public static void main(String[] args) {
        Playlist playlist = new SongPlaylist();

        playlist.addItem(new Song("Song A", "Artist A"));
        playlist.addItem(new Song("Song B", "Artist B"));
        playlist.addItem(new Song("Song C", "Artist C"));
        playlist.addItem(new Song("Song D", "Artist A"));
        playlist.addItem(new Song("Song E", "Artist B"));
        playlist.addItem(new Song("Song F", "Artist C"));
        playlist.addItem(new Song("Song G", "Artist A"));
        playlist.addItem(new Song("Song H", "Artist B"));
        playlist.addItem(new Song("Song I", "Artist C"));

        Iterator<Song> iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            Song song = iterator.getNext();

            System.out.println(song.getTitle());
        }

        Iterator<Song> reverseIterator =
                playlist.createReverseIterator();

        while (reverseIterator.hasNext()) {
            Song song = reverseIterator.getNext();

            System.out.println(song.getTitle());
        }

        while (iterator.hasNext()) {
            Song song = iterator.getNext();

            System.out.println(song.getTitle());
        }

        Iterator<Song> artistIterator =
                playlist.createArtistIterator();

        while (artistIterator.hasNext()) {
            Song song = artistIterator.getNext();

            if(song != null) {
                System.out.println(song.getTitle());
            }
        }
    }
}
