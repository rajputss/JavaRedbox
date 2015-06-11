package com.training.java.redbox.domain;

public class Movie {
	
	private int id;
	private String type;
	private String title;
	//private String director;
	//private String genre;
	private int rentalPrice;
	//private String rating;
	private String imageLocation;
	
	public Movie(int id, String type, String title, String director,
			String genre, int rentalPrice, String rating, String imageLocation) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		//this.director = director;
		//this.genre = genre;
		this.rentalPrice = rentalPrice;
		//this.rating = rating;
		this.imageLocation = imageLocation;
	}
	public Movie(int id, String type, String title, int rentalPrice, String imageLocation) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.rentalPrice = rentalPrice;
		this.imageLocation = imageLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

/*	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}*/

	public int getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	/*public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}*/

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
	
	
	
	

}
