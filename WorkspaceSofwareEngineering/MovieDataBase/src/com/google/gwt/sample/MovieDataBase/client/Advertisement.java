package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;

public class Advertisement extends Composite{
	private HorizontalPanel hPanel = new HorizontalPanel();
	public Advertisement(String title){
		initWidget(this.hPanel);
		hPanel.add(new Image(title));
	}

}
