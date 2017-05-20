package press.subject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import press.observer.Observer;

public abstract class News implements Subject {

	protected String title;
	protected Date created;
	protected String content;

	private List<Observer> observers;

	public News(String title, String content) {
		this.title = title;
		this.content = content;
		created = Calendar.getInstance().getTime();
		observers = new ArrayList<>();
	}

	public void publish() {
		observers.stream().forEach(o -> {
			o.inform(this);
		});
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(printTitle()).append(printDate()).append(printContent());
		return sb.toString();
	}

	protected abstract String printTitle();

	protected abstract String printDate();

	protected String printContent() {
		return "\n" + content + "\n";
	}
}
