package com.google.gwt.sample.MovieDataBase.client;
import java.util.LinkedList;

public class MovieStore {
	static LinkedList<Film> MovieDatabase = new LinkedList<Film>();
	public static void addToMovieDataBase(Film film){
		MovieDatabase.add(film);
	}
	public Film getNthElement(int i){
		Film film = MovieDatabase.get(i);
		return film;
	}
}
