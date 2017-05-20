package press.subject;

import java.text.SimpleDateFormat;

public class UrgentNews extends News {

	public UrgentNews(String title, String content) {
		super(title, content);
	}

	@Override
	protected String printTitle() {
		return title.toUpperCase();
	}

	@Override
	protected String printDate() {
		return "\n" + new SimpleDateFormat("dd/MM/yyyy hh:mm").format(created);
	}

}
