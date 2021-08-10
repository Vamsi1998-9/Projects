package com.myspringrest.myspring.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspringrest.myspring.Model.Movie;
import com.myspringrest.myspring.Repository.MovieRepository;
import com.myspringrest.myspring.Service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository repo;
	
	@Override
	public List<Movie> getMovieList(){
		return repo.findAll();
	}

	@Override
	public List<Movie> addMovieList(List<Movie> Movies) {
		return repo.saveAll(Movies);
	}

	@Override
	public String updateMovie(Movie movie, String name) {
		try {
			Movie existingMovie = repo.findById(name).get();
			existingMovie.setDirector(movie.getDirector());
			existingMovie.setRating(movie.getRating());
			existingMovie.setBoxOfficeCollection(movie.getBoxOfficeCollection());
			repo.save(existingMovie);
			return "done";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		
		
	}

	@Override
	public String deleteMovie(String name) {	
		try {
			repo.deleteById(name);
			return "done";
		} catch (Exception e) {
			return "error";
		}
		
	}
	
}
