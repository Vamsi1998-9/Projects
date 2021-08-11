package com.myspringrest.myspring.Service;

import java.util.List;

import com.myspringrest.myspring.Model.Movie;

public interface MovieService  {

	public List<Movie> getMovieList();
	
	public Movie addMovieList(Movie movie);
	
	public String updateMovie(Movie movie,String name); 
	
	public String deleteMovie(String name);
}
