import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lazar on 11/16/2021.
 * Project name: SocialNetwork
 **/
public class EventPost extends Post {

    private String description;
    private Date eventDate;

    public EventPost(String username, long timeStamp, int likes, ArrayList<String> commentsString, String description, Date eventDate) {
        super(username, timeStamp, likes, commentsString);
        this.description = description;
        this.eventDate = eventDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Description: " + description);
        System.out.println("eventDate: " + eventDate);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}
