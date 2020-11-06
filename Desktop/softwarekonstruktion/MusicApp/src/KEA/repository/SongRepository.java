package KEA.repository;

import KEA.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongRepository implements ISongRepository {

    List<Song> songs; // DB

    public SongRepository(){
        songs = new ArrayList<>();
        songs.add(new Song(0, "Hello world", "Java, The Band"));
        songs.add(new Song(1, "Human Nature", "Michael Jackson"));
        songs.add(new Song(2, "Over Now", "Calvin Harris (feat. The Weeknd)"));
        songs.add(new Song(3, "34+35", "Ariana Grande"));
        songs.add(new Song(4, "Headlines", "Drake"));
    }

    public Song getSong(int id) {
        return songs.get(id);
    }

    public void addSong(Song song){
        songs.add(song);
    }
}