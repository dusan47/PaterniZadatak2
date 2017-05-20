package app;

public class Main {
	
	private UserRepo users;
	private NewsRepo news;
	
	public Main() {
		users = new UserRepo();
		news = new NewsRepo();
	}
	
	public void start() {
		news.getNews().stream().forEach(n -> {
			users.getUsers().stream().forEach(u -> {
				n.attach(u);
			});
			n.publish();
		});
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
