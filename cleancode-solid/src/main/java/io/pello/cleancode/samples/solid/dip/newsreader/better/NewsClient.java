package io.pello.cleancode.samples.solid.dip.newsreader.better;

import java.util.ArrayList;

public class NewsClient {
	private ArrayList<Article> articles = new ArrayList<Article>();
	private NewsReader reader;
	
	public NewsClient () {	
	}
	
	public void loadNews (String url) {
		articles = reader.loadNews(url);
	}

	public NewsReader getReader() {
		return reader;
	}

	public void setReader(NewsReader reader) {
		this.reader = reader;
	}
}
