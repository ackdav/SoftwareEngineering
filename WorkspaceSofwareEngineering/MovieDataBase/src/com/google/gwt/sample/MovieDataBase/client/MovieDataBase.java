package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;




/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MovieDataBase implements EntryPoint {

	/**
	 * 
	 */
	/**
	private DBConnectionAsync rpc;
	public MovieDataBase() {
		rpc = (DBConnectionAsync) GWT.create(DBConnection.class);
		ServiceDefTarget target = (ServiceDefTarget) rpc;
		
		String moduleRelativeURL = GWT.getModuleBaseURL() + "MySQLConnection";
		 target.setServiceEntryPoint(moduleRelativeURL);
	}
	/**
	 * 
	 * 
	 
	  The message displayed to the user when the server cannot be reached or
	  returns an error.
	 */
//	private static final String SERVER_ERROR = "An error occurred while "
//			+ "attempting to contact the server. Please check your network "
//			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
//	private final GreetingServiceAsync greetingService = GWT
//			.create(GreetingService.class);
	
	/**
	 * This is the entry point method.
	 */
	
//	  private VerticalPanel mainPanel = new VerticalPanel();
//	  private FlexTable stocksFlexTable = new FlexTable();
//	  private HorizontalPanel addPanel = new HorizontalPanel();
//	  private TextBox newSymbolTextBox = new TextBox();
//	  private Button addStockButton = new Button("Add");
//	  private Label lastUpdatedLabel = new Label();
	
	public void onModuleLoad() {
		//MainWidget main = new MainWidget(contentV);

		
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
		
		
		
	    
	    
	    

	    
//	    TabLayoutPanel p = new TabLayoutPanel(1.5, Unit.EM);
//	    p.add(new HTML("Table"), "Table");
//	    p.add(new HTML("Map"), "Map");
//	    p.add(new HTML("Graph"), "Graph");
	    
//	    mainPanel.add(p);
	    
//	    RootPanel.get("Tab").add(p);
//	    final TextBox nameField = new TextBox();
//	    nameField.setText("Enter Filter");
//	    final Button exportButton = new Button("Export");
//	    final Button loadButton = new Button("Load Data");
//	    ScrollPanel sp = new ScrollPanel();
//	    RootPanel.get("enterFilterContainer").add(nameField);
//	    RootPanel.get("loadButtonContainer").add(loadButton);
//	    RootPanel.get("scrollPanel").add(sp);
//	    RootPanel.get("exportData").add(exportButton);
//	    mainPanel.add(nameField);
//	    mainPanel.add(loadButton);
//	    mainPanel.add(sp);
//	    mainPanel.add(exportButton);
	    
		Visualizer visualizer = new Visualizer();
		MainWidget main = new MainWidget(visualizer);
	    RootPanel.get("moviedata").add(main);
//	    newSymbolTextBox.setFocus(true);
	    
		Advertisement ad=new Advertisement("werbung.jpg");
		RootPanel.get("advertisement").add(ad);
//		
//		Map map = new Map();
//		RootPanel.get("map").add(map);
//		Visualizer visualizer = new Visualizer();
//		RootPanel.get("loadVisualizer").add(visualizer);
//		Advertisement ad=new Advertisement("werbung.jpg");
//		RootPanel.get("advertisementContainer").add(ad);
		
//		UnfoldingMap map1;
//		size(800, 600, P2D);
//		this.background(0, 255, 0);
//		AbstractMapProvider provider = new Google.GoogleTerrainProvider();
//		int zoomLevel = 10;
//		map1 = new UnfoldingMap(this, 50, 50, 350, 500, provider);
//		map1.zoomAndPanTo(zoomLevel, new Location(32.9f, -117.2f));
//		MapUtils.createDefaultEventDispatcher(this, map1);
//		map1.draw();
//		Importer i = new Importer();
//		try {
//			i.openFile();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		i.readFile();
//		MovieStore md = new MovieStore();
//		Film xyz = md.getNthElement(12312);
//		System.out.println(xyz.getMovieLength());
		
//		final Button sendButton = new Button("Send");
//		final TextBox nameField = new TextBox();
//		nameField.setText("GWT Super Dev Programmer");
//		final Label errorLabel = new Label();
//
//		// We can add style names to widgets
//		sendButton.addStyleName("sendButton");
//
//		// Add the nameField and sendButton to the RootPanel
//		// Use RootPanel.get() to get the entire body element
//		RootPanel.get("nameFieldContainer").add(nameField);
//		RootPanel.get("sendButtonContainer").add(sendButton);
//		RootPanel.get("errorLabelContainer").add(errorLabel);
//
//		// Focus the cursor on the name field when the app loads
//		nameField.setFocus(true);
//		nameField.selectAll();
//
//		// Create the popup dialog box
//		final DialogBox dialogBox = new DialogBox();
//		dialogBox.setText("Remote Procedure Call");
//		dialogBox.setAnimationEnabled(true);
//		final Button closeButton = new Button("Close");
//		// We can set the id of a widget by accessing its Element
//		closeButton.getElement().setId("closeButton");
//		final Label textToServerLabel = new Label();
//		final HTML serverResponseLabel = new HTML();
//		VerticalPanel dialogVPanel = new VerticalPanel();
//		dialogVPanel.addStyleName("dialogVPanel");
//		dialogVPanel.add(new HTML("<b>Sending name to the server:</b>"));
//		dialogVPanel.add(textToServerLabel);
//		dialogVPanel.add(new HTML("<br><b>Server replies:</b>"));
//		dialogVPanel.add(serverResponseLabel);
//		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
//		dialogVPanel.add(closeButton);
//		dialogBox.setWidget(dialogVPanel);
//
//		// Add a handler to close the DialogBox
//		closeButton.addClickHandler(new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				dialogBox.hide();
//				sendButton.setEnabled(true);
//				sendButton.setFocus(true);
//			}
//		});
//
//		// Create a handler for the sendButton and nameField
//		class MyHandler implements ClickHandler, KeyUpHandler {
//			/**
//			 * Fired when the user clicks on the sendButton.
//			 */
//			public void onClick(ClickEvent event) {
//				sendNameToServer();
//			}
//
//			/**
//			 * Fired when the user types in the nameField.
//			 */
//			public void onKeyUp(KeyUpEvent event) {
//				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
//					sendNameToServer();
//				}
//			}
//
//			/**
//			 * Send the name from the nameField to the server and wait for a response.
//			 */
//			private void sendNameToServer() {
//				// First, we validate the input.
//				errorLabel.setText("");
//				String textToServer = nameField.getText();
//				if (!FieldVerifier.isValidName(textToServer)) {
//					errorLabel.setText("Please enter at least four characters");
//					return;
//				}
//
//				// Then, we send the input to the server.
//				sendButton.setEnabled(false);
//				textToServerLabel.setText(textToServer);
//				serverResponseLabel.setText("");
//				greetingService.greetServer(textToServer,
//						new AsyncCallback<String>() {
//							public void onFailure(Throwable caught) {
//								// Show the RPC error message to the user
//								dialogBox
//										.setText("Remote Procedure Call - Failure");
//								serverResponseLabel
//										.addStyleName("serverResponseLabelError");
//								serverResponseLabel.setHTML(SERVER_ERROR);
//								dialogBox.center();
//								closeButton.setFocus(true);
//							}
//
//							public void onSuccess(String result) {
//								dialogBox.setText("Remote Procedure Call");
//								serverResponseLabel
//										.removeStyleName("serverResponseLabelError");
//								serverResponseLabel.setHTML(result);
//								dialogBox.center();
//								closeButton.setFocus(true);
//							}
//						});
//			}
//		}
//
//		// Add a handler to send the name to the server
//		MyHandler handler = new MyHandler();
//		sendButton.addClickHandler(handler);
//		nameField.addKeyUpHandler(handler)
		}
}
