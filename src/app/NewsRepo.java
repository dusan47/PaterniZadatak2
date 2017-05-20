package app;

import java.util.ArrayList;
import java.util.List;

import press.subject.News;
import press.subject.RegularNews;
import press.subject.UrgentNews;

public class NewsRepo {

	private List<News> news;
	
	public NewsRepo() {
		news = new ArrayList<>();
		news.add(new UrgentNews("Hitna vest!", "Pink bankrotirao!"));
		news.add(new RegularNews("Vremenska prognoza", "Jesen u maju..."));
	}
	
	public List<News> getNews() {
		return news;
	}
}
