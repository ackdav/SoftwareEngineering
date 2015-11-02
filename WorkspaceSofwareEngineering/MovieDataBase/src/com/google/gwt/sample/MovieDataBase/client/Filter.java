package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Filter extends Composite{
	public TextBox enterFilter;
	public CheckBox checkGenres;
	public VerticalPanel vPanel;
	public ScrollPanel scroll;
	String[] genres = {"Action","Comedy","Romance"};
	
	public Filter() {
		checkGenres = new CheckBox();
		enterFilter = new TextBox();
		
		for (int i=0; i<genres.length;i++) {
			checkGenres = new CheckBox(genres[i]);
		}
		scroll = new ScrollPanel();
		scroll.add(checkGenres);
		
		vPanel.add(enterFilter);
		vPanel.add(scroll);
	}
	
	public Widget drawFilter() {
		vPanel.setSpacing(15);
		return vPanel;
	}

}
