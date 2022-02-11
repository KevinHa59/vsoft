package assignment.Assignment10_MovieTickets.pojo;

public class Customer {

    private Movie bookedMovie;


    public Customer(Movie bookedMovie) {
        this.bookedMovie = bookedMovie;
    }

    public Customer() {
    }

    public Movie getBookedMovie() {
        return bookedMovie;
    }

    public void setBookedMovie(Movie bookedMovie) {
        this.bookedMovie = bookedMovie;
    }


}
