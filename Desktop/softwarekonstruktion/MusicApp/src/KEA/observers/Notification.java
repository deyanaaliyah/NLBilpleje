package KEA.observers;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

// This is the notification
public class Notification {
    private String headline;
    private String body;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // this method gets the machine's timestamp
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    @Override
    public String toString() {
        return "\033[0;1m" + // this makes text in console bold
                "You have received a notification\n" +
                "\033[0;0m" + // this makes text in console normal again
                timestamp + "\n\n" +
                headline +
                "\n" + body ;
    }
}
