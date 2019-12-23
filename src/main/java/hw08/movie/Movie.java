package hw08.movie;

public class Movie {
    private double ticketPrice;
    private String genre;

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getGenre() {
        return genre;
    }

    public Movie(double ticketPrice, String genre) {
        this.ticketPrice = ticketPrice;
        this.genre = genre;
    }
}
