package KEA.observers;

import java.util.HashSet;
import java.util.Set;

// this class observes the notifications
public class Notifier {
    private Notification not;
    private Set<INotifier> notification = new HashSet<>();

    public void addObserver(INotifier s){
        notification.add(s);
    }
    public void removeObserver(INotifier s){
        notification.remove(s);
    }
    public void setNotification(Notification not){
        this.not = not;
        tell(); // this method is mentioned below
    }
    private void tell(){ // here
        for(INotifier s : notification){
            s.update(not);
        }
    }
}
