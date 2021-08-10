package com.myspringrest.myspring.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Director {
	
	@Id
	private String name;
	private String age;
	private String gender;
	private String awardCount;
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Director(String name, String age, String gender, String awardCount) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.awardCount = awardCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAwardCount() {
		return awardCount;
	}
	public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}
	@Override
	public String toString() {
		return "Director [name=" + name + ", age=" + age + ", gender=" + gender + ", awardCount=" + awardCount + "]";
	}
	
	
	
}
