package com.training.java.redbox.domain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieDAOJDBCImpl extends BaseDAO implements MovieDAO {
	
	@Override
	public List<Movie> getAllMovies() throws DAOException {
	
	// Create a list of Movies
	List<Movie> movies = new ArrayList<Movie>();
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	try {
		// Calling connection
		connection = getConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from movie");
		
		// As long as there is next result to obtain
		while(resultSet.next()) {
			int id = resultSet.getInt("movie_id");
			String type = resultSet.getString("type");
			String title = resultSet.getString("title");
			int rentalPrice = resultSet.getInt("rental_price");
			String imageLocation = resultSet.getString("image_location");
			
			// Instantiate movie object
			Movie movie = new Movie(id, type, title, rentalPrice, imageLocation);
			
			// add movie object
			movies.add(movie);
			
			}
		} catch (SQLException ex) {
			throw new DAOException(ex, "Error while selecting a record from database.");
		} finally {
			closeResources(connection, statement, resultSet);
		}
		return movies;
}
}


