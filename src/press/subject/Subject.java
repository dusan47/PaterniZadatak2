package press.subject;

import press.observer.Observer;

public interface Subject {
	void attach(Observer observer);
}
