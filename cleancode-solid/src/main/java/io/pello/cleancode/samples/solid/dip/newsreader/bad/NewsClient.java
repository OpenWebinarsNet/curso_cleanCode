package io.pello.cleancode.samples.solid.dip.newsreader.bad;

import java.util.ArrayList;

public class NewsClient {
	private ArrayList<Article> articles = new ArrayList<Article>();
	private RssReader reader = new RssReader();
	
	public NewsClient () {	
	}
	
	public void loadNews (String url) {
		articles = reader.loadNews(url);
	}

	public RssReader getReader() {
		return reader;
	}

	public void setReader(RssReader reader) {
		this.reader = reader;
	}
}
