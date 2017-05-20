package app;

import java.util.ArrayList;
import java.util.List;

import press.observer.User;

public class UserRepo {

	private List<User> users;
	
	public UserRepo() {
		users = new ArrayList<>();
		users.add(new User("pera@gmail.com"));
		users.add(new User("mika@gmail.com"));
		users.add(new User("zika@gmail.com"));
	}
	
	public List<User> getUsers() {
		return users;
	}
}
