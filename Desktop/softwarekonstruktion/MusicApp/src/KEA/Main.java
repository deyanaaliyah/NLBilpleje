package KEA;

import KEA.controller.SongController;
import KEA.repository.ISongRepository;
import KEA.repository.SongRepository;
import KEA.view.View;

public class Main {

    public static void main(String[] args) {
        // model
        ISongRepository model = new SongRepository();
        // view
        View view = new View();
        // controller
        SongController controller = new SongController(model, view);
        // event loop
        controller.updateView(1);

        // create a boolean to be while-looped
        boolean eventloop = true;
        while(eventloop){
            int x = view.getNewSong();

            // if user inputs "-1", music app will then close
            if (x == -1){
                System.out.println("bye bye now");
                eventloop = false;
            }
            // if user inputs "-2", user can then create a new song
            else if(x == -2) {
                controller.addSong();
            }
            else {
                controller.updateView(x);
            }
        }
    }
}