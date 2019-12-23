package hw07.executor;

import hw07.library.LibraryReport;

import java.time.LocalDate;
import java.util.Arrays;

public class Executor {

    public void demonstrateLibraryWork() {
        demonstrateLibraryWorkingWithSingleBook();
        demonstrateLibraryWorkingWithMultipleBooks();
    }

    public void demonstrateLibraryWorkingWithSingleBook() {
        LibraryReport libraryReport = new LibraryReport();
        libraryReport.registerBook(LocalDate.of(2019, 10, 7), "Book1");
        libraryReport.registerBook(LocalDate.of(2018, 11, 8), "Book2");
        libraryReport.registerBook(LocalDate.of(2017, 12, 9), "Book3");

        LocalDate requestedDate = LocalDate.of(2018, 11, 8);
        String bookTitle = libraryReport.searchBookBy(requestedDate);
        System.out.println("Book that was borrowed on " + requestedDate + " is " + bookTitle);

        System.out.println("List of borrowed books: ");
        libraryReport.findListOfBorrowedBooks().forEach(System.out::println);

        System.out.println("Dates when books were borrowed: ");
        libraryReport.findDatesWhenBooksWereBorrowed().forEach(System.out::println);
    }

    public void demonstrateLibraryWorkingWithMultipleBooks() {
        LibraryReport libraryReport = new LibraryReport();
        libraryReport.registerFewBooks(LocalDate.of(2019, 10, 31), Arrays.asList("Book7", "Book8", "Book9"));
        libraryReport.registerFewBooks(LocalDate.of(2019, 10, 19), Arrays.asList("Book10", "Book11"));
        libraryReport.registerFewBooks(LocalDate.of(2019, 10, 13), Arrays.asList("Book12"));

        libraryReport.countBooksThatWereTakenForTheMonth(LibraryReport.MONTH.OCTOBER);
    }
}
