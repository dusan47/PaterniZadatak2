package press.observer;

import press.subject.Subject;

public class User implements Observer {
	
	private String email;
	
	public User(String email) {
		this.email = email;
	}
	
	public void sendEmail(String message) {
		System.out.println("Salje se mejl na " + email + "...");
		System.out.println(message);
	}

	@Override
	public void inform(Subject subject) {
		sendEmail(subject.toString());
	}

}
