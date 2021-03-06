package com.movie.movieapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="name",nullable = true,length = 255)
	private String name;
	
	@Column(name="rating",nullable = true,length = 255)
	private String rating;
	@Column(name="category",nullable = true,length = 255)
	private String category;
	@Column(name="type",nullable = true,length = 255)
	private String type;
	@Column(name="duration",nullable = true,length = 255)
	private String duration;
	
	public Movie() {super();}
	
	

	public Movie(Integer id, String name, String rating, String category, String type, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.category = category;
		this.type = type;
		this.duration = duration;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}



	@Override
	public String toString() {
		return "Movie\n {\nid=" + id + ", \nname=" + name + ", \nrating=" + rating + ", \ncategory=" + category + ", \ntype=" + type
				+ ", \nduration=" + duration + "}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
