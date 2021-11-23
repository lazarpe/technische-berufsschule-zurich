import java.util.ArrayList;

/**
 * Created by lazar on 11/16/2021.
 * Project name: SocialNetwork
 **/
public class Post {
    private String username;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String username, long timeStamp, int likes, ArrayList<String> comments) {
        this.username = username;
        this.timeStamp = timeStamp;
        this.likes = likes;
        this.comments = comments;
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Simulate display for the time being
     */
    public void display() {
        System.out.println("Username " + username);
        System.out.println("Posted " + timeString());
        if (likes > 0) {
            System.out.println(likes + " people like this.");
        } else {
            System.out.println();
        }
        if (comments.isEmpty()) {
            System.out.println("No Comments yet...");

        } else {
            System.out.println("   " + comments.size() + " comment(s). Press C to view");
        }
    }

    private String timeString() {
        long current = System.currentTimeMillis();
        long pastMillis = current - timeStamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return seconds + " seconds ago";
        }
    }
}
