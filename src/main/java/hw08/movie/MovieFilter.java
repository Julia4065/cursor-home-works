package hw08.movie;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class MovieFilter {

    public void findAverageTicketsPricePerGenre(List<Movie> movies1, List<Movie> movies2) {
        Map<String, Double> genreToAvgTicketPrice = Stream.of(movies1, movies2)
                .flatMap(Collection::stream)
                .collect(groupingBy(Movie::getGenre, averagingDouble(Movie::getTicketPrice)));

        System.out.println("Average ticket's price per genre: ");
        System.out.println(genreToAvgTicketPrice);
    }

    public void countMoviesPerGenre(List<Movie> movies1, List<Movie> movies2) {
        Map<String, Long> genreToQuantityOfMovies = Stream.of(movies1, movies2)
                .flatMap(Collection::stream)
                .collect(groupingBy(Movie::getGenre, counting()));

        System.out.println("Count movies per genre: ");
        System.out.println(genreToQuantityOfMovies);
    }
}
