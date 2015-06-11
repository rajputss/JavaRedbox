package com.training.java.redbox.domain;

import java.util.List;

public interface MovieDAO {
	
	List<Movie> getAllMovies() throws DAOException;
	
	//void addMovie(Movie movie) throws DAOException;
	
	//void updateMovie(Movie movie) throws DAOException;
	
	//Movie findByPrimaryKey(int id) throws DAOException;

}
