package movies;
import util.*;


public class MoviesApplication {

    public static void viewAllMovies() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
        System.out.println();

    }  // closes viewAllMovies()




    public static void viewMoviesByCategory(String category) {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category))
            System.out.println(movie.getName());
        }
        System.out.println();
    }  // closes viewMoviesByCategory




    public static void main(String[] args) {

        while (true) {
            // while loop needed to have an if/else statement below the sout statement below

        System.out.printf("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        Input input = new Input();
        int choice = input.getInt();

        switch (choice) {
            case 0 : return;
            case 1 : viewAllMovies(); break;
            case 2 : viewMoviesByCategory("animated"); break;
            case 3 : viewMoviesByCategory("drama"); break;
            case 4 : viewMoviesByCategory("horror"); break;
            case 5 : viewMoviesByCategory("scifi"); break;

            default: break;
        }





        }  // closes while loop

    }  // closes main method

}  // closes MoviesApplication class