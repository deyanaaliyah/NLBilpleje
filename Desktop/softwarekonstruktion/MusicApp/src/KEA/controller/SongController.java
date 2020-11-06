package KEA.controller;

import KEA.model.Song;
import KEA.repository.ISongRepository;
import KEA.view.View;

// this class is controlling MVC
public class SongController {

    private ISongRepository model;
    private View view;

    public SongController(ISongRepository model, View view){
        this.model = model;
        this.view = view;
    }

    // play song by ID (bc it's easier than to type in the specific song title)
    public void updateView(int id){
        view.printSongDetails(model.getSong(id));
    }

    // create a song
    public void addSong(){
        view.addSong(this);
    }
    // with the expected data
    public void newSong(String title, int id, String artist){
        model.addSong(new Song(id, title, artist));
    }
}
