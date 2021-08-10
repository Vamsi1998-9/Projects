package com.myspringrest.myspring.Service;

import java.util.List;

import com.myspringrest.myspring.Model.Movie;

public interface MovieService  {

	public List<Movie> getMovieList();
	
	public List<Movie> addMovieList(List<Movie> Movies);
	
	public String updateMovie(Movie movie,String name); 
	
	public String deleteMovie(String name);
}
