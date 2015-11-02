package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.dom.client.Style.Unit;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Visualizer extends Composite{

	Table tableV = new Table();
	Map mapV = new Map();
	
	public TabPanel visualizeContent(final Table tableV, final Map mapV){
		
		this.tableV=tableV;
		this.mapV=mapV;
		
		TabPanel tabPanel = new TabPanel();
		tabPanel.getElement().getStyle().setMarginBottom(0.0, Unit.EM);
		tabPanel.setPixelSize(800, 1);
		String[] tabTitles = {"Table", "Heatmap"};
//	    tabPanel.add(new HTML("Table"), "Table");
//	    tabPanel.add(new HTML("Map"), "Map");
//	    tabPanel.add(new HTML("Graph"), "Graph");
	    tabPanel.add(tableV.display(), tabTitles[0]);
	    tabPanel.add(mapV.printMap(), tabTitles[1]);
	    tabPanel.selectTab(0);
	    tabPanel.ensureDebugId("cwTabPanel");
	    return tabPanel;
	    	    
		//Add Widgets to TabPanel
//		
//		tabPanel.selectTab(0);
//		tabPanel.ensureDebugId("cwTabPanel");
//		return tabPanel;
		
//		Button loadButton = new Button("Load Data");
//	    Button exportButton = new Button("Export", new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				Window.open("http://www.take-a-screenshot.org/", "_blank", "");
//
//			}
//		});

//		this.vPanel.add(loadButton);
//		this.vPanel.add(exportButton);
//		loadButton.setWidth("60px");
//		exportButton.setWidth("60px");
//		this.hPanel.add(contentPanel);
//		this.hPanel.setCellWidth(contentPanel, "800px");
//		stocksFlexTable.setText(0, 0, "Symbol");
//	    stocksFlexTable.setText(0, 1, "Price");
//	    stocksFlexTable.setText(0, 2, "Change");
//	    stocksFlexTable.setText(0, 3, "Remove");
//	    
//	    addPanel.add(newSymbolTextBox);
//	    addPanel.add(addStockButton);
//	    
//	    mainPanel.add(stocksFlexTable);
//	    mainPanel.add(addPanel);
//	    mainPanel.add(lastUpdatedLabel);
//	    
//	    RootPanel.get("moviedata").add(mainPanel);
//	    
//	    newSymbolTextBox.setFocus(true);
//
//	    TabLayoutPanel p = new TabLayoutPanel(1.5, Unit.EM);
//	    p.add(new HTML("Table"), "Table");
//	    p.add(new HTML("Map"), "Map");
//	    p.add(new HTML("Graph"), "Graph");
//	    
////	    RootPanel.get("Tab").add(p);
//	    final TextBox nameField = new TextBox();
//	    nameField.setText("Enter Filter");
//	    final Button exportButton = new Button("Export");
//	    final Button loadButton = new Button("Load Data");
////	ScrollPanel sp = new ScrollPanel();
//	    RootPanel.get("enterFilterContainer").add(nameField);
//	    RootPanel.get("loadButtonContainer").add(loadButton);
////	RootPanel.get("scrollPanel").add(sp);
//	    RootPanel.get("exportData").add(exportButton);
//		return tabPanel;
			
		/**
			{
			public void onClick(ClickEvent event) {
				contentPanel.clear();
				ClientDataModeler dataDealer = new ClientDataModeler();
				//initialize
				CheckWidget checkV = new CheckWidget(dataDealer);
				TableWidget tableV = new TableWidget(dataDealer);
				HeatWidget heatV = new HeatWidget(dataDealer);
				GraphWidget graphV = new GraphWidget(dataDealer);
			
				contentPanel.add(contentV.printContentView(dataDealer, checkV, tableV,
						heatV, graphV));
			}
		});*/
//		RootPanel.get("enterFilterContainer").add(nameField);
//		RootPanel.get("loadButtonContainer").add(loadButton);
		}

}
