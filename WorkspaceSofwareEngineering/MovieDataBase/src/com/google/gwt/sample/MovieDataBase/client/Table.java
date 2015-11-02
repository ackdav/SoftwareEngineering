package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

public class Table extends Composite{
	FlexTable table;
	ScrollPanel sctab = new ScrollPanel();
	
	public Table() {
		table = new FlexTable();
		
//		table.setText(0, 0, "No Selection made.");
		table.setText(0, 0, "WikipediaID");
		table.setText(0, 1, "FreebaseID");
		table.setText(0, 2, "Name");
		table.setText(0, 3, "Year");
		table.setText(0, 4, "Revenue");
		table.setText(0, 5, "Length");
		table.setText(0, 6, "Language");
		table.setText(0, 7, "Country");
		table.setText(0, 8, "Genre");
		sctab = new ScrollPanel();
		sctab.setHeight("505px");
		sctab.add(table);
	}
	
	public Widget display() {
		return sctab;
	}
	
}
