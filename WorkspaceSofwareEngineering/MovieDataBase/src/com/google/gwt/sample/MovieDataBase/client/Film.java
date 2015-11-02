package com.google.gwt.sample.MovieDataBase.client;
import java.util.LinkedList;


import com.google.gwt.user.client.rpc.IsSerializable;
public class Film implements IsSerializable{


		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public double getMovieLength() {
			return movieLength;
		}

		public void setMovieLength(double movieLength) {
			this.movieLength = movieLength;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public LinkedList<String> getGenres() {
			return genres;
		}

		public void setGenres(LinkedList<String> genres) {
			this.genres = genres;
		}

		private int ID;
		private String movieName;
		private String date;
		private double movieLength;
		private String language;
		private String location;
		private LinkedList<String> genres = new LinkedList<String>();

		public Film(int anID, String aMovieName, String aDate, double aMovieLength, String aLanguage, String aLocation, LinkedList<String> aListOfGenres){
			this.ID = anID;
			this.movieName = aMovieName;
			this.date = aDate;
			this.movieLength = aMovieLength;
			this.location = aLocation;
			this.genres = aListOfGenres;
		}
}
