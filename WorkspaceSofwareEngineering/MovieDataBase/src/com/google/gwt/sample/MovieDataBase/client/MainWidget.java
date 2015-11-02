package com.google.gwt.sample.MovieDataBase.client;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainWidget extends Composite{
	private HorizontalPanel hPanel = new HorizontalPanel();
	private VerticalPanel vPanel = new VerticalPanel();
	private HorizontalPanel contentPanel = new HorizontalPanel();
	Visualizer visualizer = new Visualizer();
//	Logger logger = Logger.getLogger("logger");
	
	public MainWidget(final Visualizer visualizer) {
		this.visualizer = visualizer;
		TextBox enterFilter = new TextBox();
		enterFilter.setFocus(true);
//		enterFilter.addKeyDownHandler(new KeyDownHandler() {
//			      public void onKeyDown(KeyDownEvent event) {
//			        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
//			        	logger.log(Level.INFO, "You just printed Enter!");
//			        }
//			      }
//			    });
		Button loadBtn = new Button("Export", new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.open("http://www.take-a-screenshot.org/", "_blank", "");

			}
		});
		CheckBox checkGenres = new CheckBox();
		String genres[] = {"Action","Romance","Comedy"};
		for (int i=0; i<genres.length;i++) {
			checkGenres = new CheckBox(genres[i]);
		}
		ScrollPanel scroll = new ScrollPanel();
		scroll.add(checkGenres);
		Label title = new Label("Please Enter Filter");
		vPanel.add(title);
		vPanel.add(enterFilter);
		vPanel.add(scroll);
		initWidget(this.hPanel);
		this.hPanel.getElement().getStyle().setBackgroundColor("rgb(255,255,255)");
		this.hPanel.setBorderWidth(10);
		this.hPanel.setSpacing(10);
		this.hPanel.add(vPanel);
		this.hPanel.setCellWidth(vPanel, "80px");
		this.hPanel.setCellHeight(vPanel, "400px");
		this.vPanel.setSpacing(15);
//		this.vPanel.add(newBtn);
		this.vPanel.add(loadBtn);
//		this.vPanel.add(filter.drawFilter());
//		newBtn.setWidth("60px");
		loadBtn.setWidth("60px");
		
		this.hPanel.add(contentPanel);
		this.hPanel.setCellWidth(contentPanel, "800px");
		Table tableV = new Table();
		Map mapV = new Map();
	
		contentPanel.add(visualizer.visualizeContent(tableV, mapV));
	
	}

}
