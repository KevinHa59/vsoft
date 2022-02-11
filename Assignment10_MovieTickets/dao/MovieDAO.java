package assignment.Assignment10_MovieTickets.dao;


import java.util.List;

import assignment.Assignment10_MovieTickets.pojo.Movie;

public interface MovieDAO {
    void addMovie();
    List<Movie> viewAllMovies();
    Movie viewMovie();
    void updateMovie();
    void deleteMovie();
}
