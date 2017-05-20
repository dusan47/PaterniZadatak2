package press.subject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RegularNews extends News {

	public RegularNews(String title, String content) {
		super(title, content);
	}

	@Override
	protected String printTitle() {
		return title;
	}

	@Override
	protected String printDate() {
		return "\n" + new SimpleDateFormat("dd/MM/yyyy hh:mm").format(dayAheadOfCreated());
	}

	private Date dayAheadOfCreated() {
		Calendar dayAhead = Calendar.getInstance();
		dayAhead.setTime(created);
		dayAhead.add(Calendar.DAY_OF_MONTH, 1);
		return dayAhead.getTime();
	}

}
