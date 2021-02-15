package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "MOVIE")
@EqualsAndHashCode
@ToString
public class Movie extends BaseEntity{

	@Column(name = "NAME", length = 20)
	private String name;
	@Column(name = "GENRE", length = 20)
	private String genre;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre.toUpperCase();
	}
	public Movie() {
	}
	public Movie(String name, String genre) {
		this.name = name;
		this.genre = genre.toUpperCase();
	}
	
}
