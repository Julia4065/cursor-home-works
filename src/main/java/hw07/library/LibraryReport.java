package hw07.library;

import java.time.LocalDate;
import java.util.*;

public class LibraryReport {

    private Map<LocalDate, String> libraryReport = new HashMap<>();
    private Map<LocalDate, List<String>> libraryReportForMultipleBooksTaken = new TreeMap<>();

    public void registerBook(LocalDate date, String bookTitle) {
        libraryReport.put(date, bookTitle);
    }

    public String searchBookBy(LocalDate bookBorrowDate) {
        return libraryReport.getOrDefault(bookBorrowDate, "There are no books for this date");
    }

    public Collection<String> findListOfBorrowedBooks() {
        return libraryReport.values();
    }

    public Set<LocalDate> findDatesWhenBooksWereBorrowed() {
        return libraryReport.keySet();
    }

    public void registerFewBooks(LocalDate date, List<String> bookTitles) {
        libraryReportForMultipleBooksTaken.put(date, bookTitles);
    }

    public void countBooksThatWereTakenForTheMonth(MONTH month) {

        LocalDate startDate = LocalDate.of(2019, month.getNumberOfMonth(), 1);
        LocalDate endDate = LocalDate.of(2019, month.getNumberOfMonth(), 31);

        Map<LocalDate, Integer> dayToCount = new TreeMap<>();

        while (!startDate.isAfter(endDate)) {
            int count = libraryReportForMultipleBooksTaken.getOrDefault(startDate, Collections.emptyList()).size();
            dayToCount.put(startDate, count);
            startDate = startDate.plusDays(1);
        }

        System.out.println(dayToCount);
    }

    public enum MONTH {
        OCTOBER(10);

        private final int monthNumber;

        MONTH(final int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public int getNumberOfMonth() {
            return monthNumber;
        }
    }
}
