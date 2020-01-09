package hw08.executor;

import hw08.box.Box;
import hw08.box.BoxWrapper;
import hw08.box.Thing;
import hw08.function.implementation.CustomFunctionInterfaceImpl;
import hw08.movie.Movie;
import hw08.movie.MovieFilter;
import hw08.user.User;
import hw08.user.UserFilter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Executor {
    public void demonstrateFunctionalPrograms() {
        demonstrateFilteringUsers();
        demonstrateFilteringMovies();
        demonstrateFilteringBoxWithThings();
        demonstrateCustomFunctionInterface();
    }

    public void demonstrateCustomFunctionInterface() {
        new CustomFunctionInterfaceImpl().evaluateValue(6);
    }

    public void demonstrateFilteringUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("email1", LocalDate.of(2019, 12, 10), "team1"));
        users.add(new User("email2", LocalDate.of(2019, 12, 18), "team2"));
        users.add(new User("email3", LocalDate.of(2019, 12, 20), "team3"));
        users.add(new User("email4", LocalDate.of(2019, 12, 21), "team3"));

        new UserFilter().findUserMailsWhoLoggedInWeekAgoGroupedByTeams(users);
    }

    public void demonstrateFilteringMovies() {
        List<Movie> firstListOfMovies = new ArrayList<>();
        List<Movie> secondListOfMovies = new ArrayList<>();

        firstListOfMovies.add(new Movie(2.00, "comedy"));
        firstListOfMovies.add(new Movie(3.00, "horror"));
        firstListOfMovies.add(new Movie(4.00, "drama"));
        secondListOfMovies.add(new Movie(5.00, "comedy"));
        secondListOfMovies.add(new Movie(6.00, "horror"));
        secondListOfMovies.add(new Movie(7.00, "drama"));
        secondListOfMovies.add(new Movie(8.00, "drama"));
        secondListOfMovies.add(new Movie(9.00, "drama"));

        new MovieFilter().findAverageTicketsPricePerGenre(firstListOfMovies, secondListOfMovies);
        new MovieFilter().countMoviesPerGenre(firstListOfMovies, secondListOfMovies);
    }

    public void demonstrateFilteringBoxWithThings() {
        List<Box> box = new ArrayList<>();
        List<Thing> things1 = Arrays.asList(new Thing("thing1", true));
        List<Thing> things2 = Arrays.asList(new Thing("thing3", false), new Thing("thing4", false));
        List<Thing> things3 = Arrays.asList(new Thing("thing5", true), new Thing("thing6", false), new Thing("thing7", true));

        box.add(new Box(things1));
        box.add(new Box(things2));
        box.add(new Box(things3));

        new BoxWrapper().packFragileThings(box);
    }
}
