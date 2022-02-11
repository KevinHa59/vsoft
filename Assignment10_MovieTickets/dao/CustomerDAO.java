package assignment.Assignment10_MovieTickets.dao;



import java.util.List;

import assignment.Assignment10_MovieTickets.pojo.Movie;

public interface CustomerDAO {
    List<Movie> viewAllMovies();
    Movie viewTicketBooked();
    void bookTicket();
    void cancelTicket();
}
