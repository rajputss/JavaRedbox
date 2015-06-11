package com.training.java.redbox;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.redbox.domain.DAOException;
import com.training.java.redbox.domain.Movie;
import com.training.java.redbox.domain.MovieDAO;
import com.training.java.redbox.domain.MovieDAOJDBCImpl;

/**
 * Servlet implementation class ListMoviesServlet
 */
@WebServlet("/list")
public class ListMoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListMoviesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MovieDAO dao = new MovieDAOJDBCImpl();
		try {
		List<Movie> movies = dao.getAllMovies();
		
		request.setAttribute("movies", movies);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ShowMovies.jsp");
		rd.forward(request, response);
		
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

}
