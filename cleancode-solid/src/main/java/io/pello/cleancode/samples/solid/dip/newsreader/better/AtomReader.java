package io.pello.cleancode.samples.solid.dip.newsreader.better;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AtomReader implements NewsReader {

	public ArrayList<Article> loadNews (String url) {
		// Obviously, Fake request hardcoded news
		ArrayList<Article> articles = new ArrayList<Article>();
		
		articles.add(new Article("Sample1","John Doe","Bla bla",new Date()));
		articles.add(new Article("Sample2","Juan Nadie","Bla bla",new Date()));
		articles.add(new Article("Sample3","Pancho Villa","Bla bla",new Date()));
		
		return new ArrayList<Article>();
	}
}
