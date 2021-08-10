package com.myspringrest.myspring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myspringrest.myspring.Model.Movie;
import com.myspringrest.myspring.Service.MovieService;

@RestController
public class MovieController {

		@Autowired
		private MovieService service;
		
		@GetMapping("/film")
		public List<Movie> getMovieList()
		{
			return service.getMovieList();
		}
		
		@PostMapping("/film")
		public List<Movie> addMovieList(@RequestBody List<Movie> MovieList)
		{
			return service.addMovieList(MovieList);
		}
		
		@PutMapping("/updateMovie/{name}")
		public String updateMovie (@RequestBody Movie movie,@PathVariable String name)
		{
			return service.updateMovie(movie, name);
		}
		
		@DeleteMapping("/deleteMovie/{name}")
		public String deleteMovie(@PathVariable String name)
		{
			return service.deleteMovie(name);
		}
}
