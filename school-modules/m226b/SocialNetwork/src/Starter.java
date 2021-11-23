import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {
		NewsFeed news = new NewsFeed();

		ArrayList<String> comments = new ArrayList<String>();
		comments.add("comment1");
		comments.add("comment2");
		comments.add("comment3");

		Post post = new Post("John", System.currentTimeMillis(), 0, comments);
		//MessagePost post1 = new MessagePost("john", "Had a great day up in Zermatt!");
		post.like();
		post.like();
		
		news.addPost(post);
		news.show();
	}

}
