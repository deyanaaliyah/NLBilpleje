package KEA.observers;

public class Private implements INotifier{

    @Override
    public void update(Notification notification) {
        System.out.println("--------------------------\n" +
                notification +
                "\n--------------------------\n");
    }
}