package KEA.repository;

import KEA.model.Song;

public interface ISongRepository {
    Song getSong(int id);
    void addSong(Song song);
}
