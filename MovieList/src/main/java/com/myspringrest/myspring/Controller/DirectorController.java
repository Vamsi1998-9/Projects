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

import com.myspringrest.myspring.Model.Director;
import com.myspringrest.myspring.Service.DirectorService;

@RestController
public class DirectorController {

	@Autowired
	private DirectorService service;
	
	
	@GetMapping("/direct")
	public List<Director> getDirectors()
	{
		return service.getDirectors();
	}
	
	@PostMapping("/direct")
	public List<Director> addDirectors(@RequestBody List<Director> List)
	{
		return service.addDirectors(List);
	}
	
	@PutMapping("/updateDirect/{directorName}")
	public String updateDirector(@RequestBody Director director,@PathVariable String directorName)
	{
		return service.updateDirector(director, directorName);
	}
	
	@DeleteMapping("/deleteDirect/{directorName}")
	public String deleteDirector(@PathVariable String directorName)
	{
		return service.deleteDirector(directorName);
	}
	
}
