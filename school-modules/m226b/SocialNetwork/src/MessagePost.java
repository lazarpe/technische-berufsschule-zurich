import java.util.ArrayList;

/**
 * This class stores information about a post in a social network.
 * The main attribute is the message, however it also stores some other data such
 * as the author, possible comments and likes.
 * 
 * @author based on example in ObjectsFirst
 *
 */

public class MessagePost extends Post {
	private String message;

	public MessagePost(String username, long timeStamp, int likes, ArrayList<String> commentsString, String message) {
		super(username, timeStamp, likes, commentsString);
		this.message = message;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Message: " + message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
