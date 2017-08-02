package io.pello.cleancode.samples.solid.dip.newsreader.better;

import java.util.ArrayList;

public interface NewsReader {
	public ArrayList<Article> loadNews (String url);
}
