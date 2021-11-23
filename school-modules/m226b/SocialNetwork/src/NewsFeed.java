import java.util.ArrayList;

public class NewsFeed {
	private ArrayList<Post> posts;

	public NewsFeed() {
		posts = new ArrayList<>();
	}

	public void addPost(Post post) {
		posts.add(post);
	}
	
	public void show() {
		for(Post post : posts) {
			post.display();
			System.out.println();
		}
	}
}
