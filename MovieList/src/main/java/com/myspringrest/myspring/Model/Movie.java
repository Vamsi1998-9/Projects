package com.myspringrest.myspring.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private String name;
	private String boxOfficeCollection;
	private String rating;
	private String director;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movie(String name, String boxOfficeCollection, String rating, String director) {
		super();
		this.name = name;
		this.boxOfficeCollection = boxOfficeCollection;
		this.rating = rating;
		this.director = director;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoxOfficeCollection() {
		return boxOfficeCollection;
	}
	public void setBoxOfficeCollection(String boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", boxOfficeCollection=" + boxOfficeCollection + ", rating=" + rating
				+ ", director=" + director + "]";
	}
	
	
}
