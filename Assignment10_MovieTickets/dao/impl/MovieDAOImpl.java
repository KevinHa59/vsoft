package assignment.Assignment10_MovieTickets.dao.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment.Assignment10_MovieTickets.dao.MovieDAO;
import assignment.Assignment10_MovieTickets.pojo.Movie;

public class MovieDAOImpl implements MovieDAO {

    Scanner sc = new Scanner(System.in);

    static List<Movie> movies = new ArrayList<>();


    public static List<Movie> getMovies() {
        return movies;
    }

    // custom input
    int toInt(String message){
        System.out.print(message);
        return sc.nextInt();
    }
    String toString(String message){
        System.out.print(message);
        return sc.next();
    }
    public  void InitialListOfMovies(){
        movies.add(new Movie(1,"SpiderMan","1:00",3));
        movies.add(new Movie(2,"AntMan","3:00",1));
        movies.add(new Movie(3,"IronMan","5:00",2));
        movies.add(new Movie(4,"HarryPotter","8:00",4));
    }
    @Override
    public void addMovie() {
        int id = toInt("-Enter Movie ID: ");
        String name = toString("-Enter Movie Name: ");
        String time = toString("-Enter Movie Start Time 'hh:mm': ");
        int room = toInt("-Enter Room Number: ");
        movies.add(new Movie(id, name, time, room));
        System.out.println("+++Add Movie success+++");
    }

    @Override
    public List<Movie> viewAllMovies() {
        return movies;
    }

    @Override
    public Movie viewMovie() {
        int movieID = toInt("-Enter Movie ID: ");
        for(Movie b : movies){
            if(b.getId() == movieID){
                return b;
            }
        }
        return null;
    }

    @Override
    public void updateMovie() {
        Movie b = viewMovie();
        if(b == null){
            System.out.println("Movie does not exist");
        }else {
            int movieIndex = movies.indexOf(b);
            movies.get(movieIndex).setName(toString("-Enter Movie Name: "));
            movies.get(movieIndex).setStartTime(toString("-Enter Movie Start Time 'hh:mm': "));
            movies.get(movieIndex).setRoom(toInt("-Enter Room Number: "));
            System.out.println("+++Update Movie success+++");
        }
    }

    @Override
    public void deleteMovie() {
        Movie b = viewMovie();
        if(b == null){
            System.out.println("Movie does not exist");
        }else {
            movies.remove(b);
            System.out.println("+++Delete Movie success+++");
        }
    }
}
