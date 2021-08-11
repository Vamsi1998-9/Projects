package com.myspringrest.myspring.Service.ServiceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspringrest.myspring.Model.Director;
import com.myspringrest.myspring.Repository.DirectorRepository;
import com.myspringrest.myspring.Service.DirectorService;

@Service
public class DirectorServiceImpl implements DirectorService{

	@Autowired
	private DirectorRepository repo;
	
	@Override
	public List<Director> getDirectors() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Director addDirectors(Director directorList) {
		// TODO Auto-generated method stub
		return repo.save(directorList);
	}

	@Override
	public String updateDirector(Director director,String name) {
		// TODO Auto-generated method stub
		try {
			Director existingDirector = repo.findById(name).get();
			existingDirector.setAge(director.getAge());
			existingDirector.setAwardCount(director.getAwardCount());
			existingDirector.setGender(director.getGender());
			repo.save(existingDirector);
			return "done";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		
		
	}

	@Override
	public String deleteDirector(String name) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(name);
			return "done";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
				
	}

	
	
}
