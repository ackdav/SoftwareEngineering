package com.google.gwt.sample.MovieDataBase.client;
import java.io.*;
import java.util.*;

public class Importer {
	private int ID;
	private String movieName;
	private String date;
	private double movieLength;
	private String language;
	private String location;
	private LinkedList<String> genres = new LinkedList<String>();
	//for all the elements, that we cannot identify
	private String sink;

	private Scanner scan;
	public void openFile() throws FileNotFoundException
	{
		scan = new Scanner(new File("movies_80000.tsv"));
	}
	
	public void readFile()
	{
		while(scan.hasNext()){
			String line = scan.nextLine();
			//for every unknown property we add the word 'unknown' between the two \t
			line = line.replaceAll("\t\t","\tunknown\t");
			line = line.replaceAll("\t\t","\tunknown\t");
			line = line.replaceAll("\t\t","\tunknown\t");
			line = line.replaceAll("\\{\".*?\": \"", "");
			line = line.replaceAll("\"\\}", "");
			line = line.replaceAll("\", \"/.*\": \"", "\t");
			line = line.replaceAll("\\{\\}", "unknown");

//			System.out.println(line);
			StringTokenizer tokanizer = new StringTokenizer(line, "\t");
			String testIfKnown = tokanizer.nextToken();
			ID = Integer.parseInt(testIfKnown);
			sink = tokanizer.nextToken();
			movieName = tokanizer.nextToken();
			date = tokanizer.nextToken();
			sink = tokanizer.nextToken();
			testIfKnown = tokanizer.nextToken();
			if (testIfKnown.equals("unknown")){
				sink = testIfKnown;
			}
			else{
				movieLength = Double.parseDouble(testIfKnown);
			}
			language = tokanizer.nextToken();
			location = tokanizer.nextToken();
			genres.clear();
			while(tokanizer.hasMoreTokens()){
				genres.add(tokanizer.nextToken());
			}
			if(genres.size()==0){
				genres.add("unknown");
			}
			Film film = new Film(ID, movieName, date, movieLength, language, location, genres);
			MovieStore.addToMovieDataBase(film);
//			System.out.print("ID: " + ID + "\tname: " + movieName + "\tdate: " + date + "\tlength: " +  movieLength + "\tlanguage: " + language + "\tlocation: "+ location);
//			System.out.print("\tgenres: ");
//			
//			for (int i = 0; i < genres.size(); i++){
//				System.out.print(genres.get(i) + "\t");
//			}
//			System.out.print("\n");
		}
	}	
}