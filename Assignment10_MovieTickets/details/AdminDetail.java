package assignment.Assignment10_MovieTickets.details;

import java.util.Scanner;

import assignment.Assignment10_MovieTickets.Client.Client;
import assignment.Assignment10_MovieTickets.dao.impl.MovieDAOImpl;
import assignment.Assignment10_MovieTickets.pojo.Movie;

public class AdminDetail {
    Scanner sc = new Scanner(System.in);
    MovieDAOImpl movieDAO = new MovieDAOImpl();

    // custom input
    void log(String message){
        System.out.println(message);
    }
    int toInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    String toString(String message){
        System.out.print(message);
        return sc.next();
    }

    public void menu(){

        log("**********");
        log("1) Add Movie\n2) View All Movies\n3) View Movie\n4) Update Movie\n5) Delete Movie\n6) Back\n7) Initial (5) Movies");
        log("**********");
        int select = toInt("-Enter Your Selection: ");
        switch (select){
            case 1:
                movieDAO.addMovie();
                break;
            case 2:
                for(Movie b : movieDAO.viewAllMovies()){
                    System.out.println(b);
                }
                break;
            case 3:
                System.out.println(movieDAO.viewMovie());

                break;
            case 4:
                movieDAO.updateMovie();
                break;
            case 5:
                movieDAO.deleteMovie();
                break;
            case 6:
                Client.menu();
                break;
            case 7:
                movieDAO.InitialListOfMovies();
                break;
            default:
                log("Selection between 1-6 only");
        }
        menu();
    }

}
