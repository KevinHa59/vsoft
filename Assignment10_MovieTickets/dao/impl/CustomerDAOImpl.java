package assignment.Assignment10_MovieTickets.dao.impl;


import java.util.List;
import java.util.Scanner;

import assignment.Assignment10_MovieTickets.dao.CustomerDAO;
import assignment.Assignment10_MovieTickets.pojo.Movie;

public class CustomerDAOImpl implements CustomerDAO {
    private Movie b;
    Scanner sc = new Scanner(System.in);

    // custom input
    int toInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }

    @Override
    public List<Movie> viewAllMovies() {
        return MovieDAOImpl.movies;
    }

    @Override
    public Movie viewTicketBooked() {
        return b;
    }

    @Override
    public void bookTicket() {
        List<Movie> movies = MovieDAOImpl.getMovies();
        if(movies.size() == 0) {
            System.out.println("There is no movie available");
            return;
        }

        System.out.println("Movie List: ");
        for(Movie b : movies){
            System.out.println(b);
        }
        int movieID = toInt("-Enter Movie Number to book: ");
        for(Movie b : movies){
            if(b.getId() == movieID){
                this.b = b;
                System.out.println("+++Book Movie success+++");
                break;
            }
        }
    }

    @Override
    public void cancelTicket() {
        if(b == null){
            System.out.println("You do not have any movie ticket to cancel.");
            return;
        }
        b = null;
        System.out.println("+++Cancel Ticket Success+++");
    }
}
