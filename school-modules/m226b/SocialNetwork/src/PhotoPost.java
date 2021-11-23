import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 *
 * @author based on ObjectsFirst book
 */
public class PhotoPost extends Post {
	private String filename;
	private String caption;

	/**
	 * Instantiates a new Photo post.
	 *
	 * @param filename
	 * @param caption
	 */
	public PhotoPost(String username, long timeStamp, int likes, ArrayList<String> commentsString, String filename, String caption) {
		super(username, timeStamp, likes, commentsString);
		this.filename = filename;
		this.caption = caption;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Filename: " + filename);
		System.out.println("caption: " + caption);
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
