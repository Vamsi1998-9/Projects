package com.myspringrest.myspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myspringrest.myspring.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String>{
	
}
