package com.google.gwt.sample.MovieDataBase.client;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Locale.Builder;
import java.util.Map.Entry;

import org.apache.commons.lang3.ArrayUtils;

import sun.awt.VerticalBagLayout;

import com.google.gwt.core.client.GWT;
//import com.google.gwt.dev.util.collect.HashMap;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DropEvent;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.visualizations.GeoMap;
import com.google.gwt.visualization.client.visualizations.GeoMap.DataMode;
import com.google.gwt.visualization.client.visualizations.GeoMap.Options;
import com.google.gwt.widgetideas.client.SliderBar;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
//import com.team10.agrardataviewer.shared.DataRow;

public class Map extends Composite  {
	int maxYear;
	int minYear;
	boolean localLandSelection[];
	private HashMap<String, HashMap<Integer, Integer>> countryValues; // (Landname,(Year,value))
	private int year;
	DataTable dataTable;
	GeoMap.Options options;
	private GeoMap geomap;
	private VerticalPanel vepa;
	//private ClientDataModeler myDealer;
	private ScrollPanel scpa;
//	SliderBar slider;
	Label yearLabel;
	//private QueryConstructor queryMaker = new QueryConstructor();

	public Map() {
		maxYear = 0;
		minYear = Integer.MAX_VALUE;
		year = 2011;
//		slider = new SliderBar(1990, 2011);
//		slider.setStepSize(1.0);
//		slider.setCurrentValue(2011.0);
//		slider.setNumTicks(21);
//		slider.setNumLabels(21);
		yearLabel = new Label(Integer.toString(year));
//		slider.addChangeListener(new ChangeListener() {
//
//			@Override
//			public void onChange(Widget sender) {
//				yearLabel.setText(Double.toString(slider.getCurrentValue()));
//				drawMap();
//				year = (int) slider.getCurrentValue();
//
//			}
//		});
		//myDealer = newDealer;
		//myDealer.subscribe(this);
		Runnable onLoadCallback = new Runnable() {
			public void run() {

			}
		};
		VisualizationUtils.loadVisualizationApi(onLoadCallback, GeoMap.PACKAGE);
	}

	public Widget printMap() {
		vepa = new VerticalPanel();
		scpa =new ScrollPanel();
		vepa.clear();
		Runnable onLoadCallback = new Runnable() {
			public void run() {
				dataTable = DataTable.create();
				dataTable.addColumn(ColumnType.STRING, "ADDRESS", "address");
				dataTable.addColumn(ColumnType.STRING, "Value", "value");
				dataTable.addRow();
				dataTable.setValue(0, 0, "");
				dataTable.setValue(0, 1, "2000");
				dataTable.addRow();
				dataTable.setValue(1, 0, "");
				dataTable.setValue(1, 1, "200");

				options = GeoMap.Options.create();
				options.setDataMode(GeoMap.DataMode.REGIONS);
				options.setHeight(505);
				options.setWidth(885);
				options.setShowLegend(false);
				options.setColors(0xFF8747, 0xFFB581, 0xc06000);
				options.setRegion("world");
				geomap = new GeoMap(dataTable, options);
				scpa.add(geomap);
				scpa.setHeight("505px");
				scpa.setWidth("885px");
				vepa.add(scpa);
//				vepa.add(slider);
				vepa.add(yearLabel);
			}
		};
		VisualizationUtils.loadVisualizationApi(onLoadCallback, GeoMap.PACKAGE);
		return vepa;
	}

	public void drawMap() {
//		if(countryValues==null){
//			return;
//		}
		Runnable onLoadCallback = new Runnable() {
			public void run() {

				dataTable = DataTable.create();

				dataTable.addColumn(ColumnType.STRING, "ADDRESS", "address");
				dataTable.addColumn(ColumnType.STRING, "Value", "value");
//				
//				dataTable.addRows(countryValues.size());
//				int i = 0;
//				for (Entry<String, HashMap<Integer, Integer>> entry : countryValues
//						.entrySet()) {
//
//					dataTable.setValue(i, 0, entry.getKey());
//					dataTable.setValue(i, 1,
//							Integer.toString(entry.getValue().get(year)));
//					i++;
//
//				}
				options = GeoMap.Options.create();
				options.setDataMode(GeoMap.DataMode.REGIONS);
				options.setHeight(505);
				options.setWidth(885);
				options.setShowLegend(true);
				options.setColors(0x40E0D0, 0x9ACD32, 0xFF7F50);
				options.setRegion("world");
				geomap.draw(dataTable, options);

			}
		};

		VisualizationUtils.loadVisualizationApi(onLoadCallback, GeoMap.PACKAGE);

	}

//	@Override
//	public void updateNames() {
//		// TODO Auto-generated method stub
//
//	}

//	@Override
//public void redraw(ArrayList<DataRow> data) {
//		
//		countryValues = new HashMap<String, HashMap<Integer, Integer>>();
//		for (DataRow row : data) {
//			if (!countryValues.containsKey(row.getAreaName())) {
//				countryValues.put(row.getAreaName(),
//						new HashMap<Integer, Integer>());
//
//			}
//			if(!countryValues.get(row.getAreaName()).containsKey((int) row.getYear())){
//				countryValues.get(row.getAreaName()).put((int) row.getYear(),
//						0);
//			}
//			int currVal = (int) countryValues.get(row.getAreaName()).get((int)row.getYear());
//			countryValues.get(row.getAreaName()).remove((int)row.getYear());
//			countryValues.get(row.getAreaName()).put((int)row.getYear(), (int)row.getValue()+currVal);
//			if (row.getYear() > maxYear) {
//				maxYear = (int) row.getYear();
//			}
//			if (row.getYear() < minYear) {
//				minYear = (int) row.getYear();
//			}
//
//		}
//		//yearLabel.setText("redraw: " + data.size());
//		drawMap();
//	}
//	public void redraw(ArrayList<DataRow> data) {
//		if (data.size() > 0) {
//			countryValues = new HashMap<String, HashMap<Integer, Integer>>();
//			for (DataRow row : data) {
//				if (!countryValues.containsKey(row.getAreaName())) {
//					countryValues.put(row.getAreaName(),
//							new HashMap<Integer, Integer>());
//
//				}
//				countryValues.get(row.getAreaName()).put((int) row.getYear(),
//						(int) row.getValue());
//
//			}
//			drawMap();
//		}
//	}
}
