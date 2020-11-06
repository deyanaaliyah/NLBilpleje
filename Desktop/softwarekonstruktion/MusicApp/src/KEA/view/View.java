package KEA.view;

import KEA.controller.SongController;
import KEA.model.Song;
import KEA.observers.Notification;
import KEA.observers.Notifier;
import KEA.observers.Private;

import java.util.Scanner;

// this class controls the view
public class View {

    SongController controller = new SongController(null, null);

    // now playing method is 50/50 notification and song info
    public void printSongDetails(Song song){
        Notifier model = new Notifier();
        model.addObserver(new Private());

        Notification t = new Notification();
        t.setHeadline("Now playing : ");
        t.setBody(song.getTitle() + " by " + song.getArtist());

        model.setNotification(t);
    }

    // if user type a number, number of index in song will play
    // e.g. type 2 to play "Over Now" by "Calvin Harris (feat. The Weeknd)" (check class SongRepository) and so on
    public int getNewSong(){
        Scanner inp = new Scanner(System.in);
        return inp.nextInt();
    }

    // creates a song
    public void addSong(SongController sc){
        Scanner inp = new Scanner(System.in);
        System.out.println("Adding a new song" );

        System.out.print("Song title : ");
        String title = inp.nextLine();

        System.out.print("Name of artist :");
        String artist = inp.nextLine();

        System.out.print("Song ID : ");
        int id = inp.nextInt();

        sc.newSong(title, id, artist);
    }
}