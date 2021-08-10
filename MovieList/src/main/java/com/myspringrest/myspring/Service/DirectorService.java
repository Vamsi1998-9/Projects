package com.myspringrest.myspring.Service;

import java.util.List;

import com.myspringrest.myspring.Model.Director;

public interface DirectorService {

	public List<Director> getDirectors();
	
	public List<Director> addDirectors(List<Director> directorList);
	
	public String updateDirector(Director director,String name);
	
	public String deleteDirector(String name);
}
