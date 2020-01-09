package hw07.library;

import java.time.LocalDate;
import java.util.*;

public class LibraryReport {

    private Map<LocalDate, String> borrowDateToBook = new HashMap<>();
    private Map<LocalDate, List<String>> borrowDateToBookList = new TreeMap<>();

    public void registerBook(LocalDate date, String bookTitle) {
        borrowDateToBook.put(date, bookTitle);
    }

    public String searchBookBy(LocalDate bookBorrowDate) {
        return borrowDateToBook.getOrDefault(bookBorrowDate, "There are no books for this date");
    }

    public Collection<String> findListOfBorrowedBooks() {
        return borrowDateToBook.values();
    }

    public Set<LocalDate> findDatesWhenBooksWereBorrowed() {
        return borrowDateToBook.keySet();
    }

    public void registerFewBooks(LocalDate date, List<String> bookTitles) {
        borrowDateToBookList.put(date, bookTitles);
    }

    public void countBooksThatWereTakenForTheMonth(MONTH month) {

        LocalDate startDate = LocalDate.of(2019, month.getNumberOfMonth(), 1);
        LocalDate endDate = LocalDate.of(2019, month.getNumberOfMonth(), 31);

        Map<LocalDate, Integer> dayToCount = new TreeMap<>();

        while (!startDate.isAfter(endDate)) {
            int count = borrowDateToBookList.getOrDefault(startDate, Collections.emptyList()).size();
            dayToCount.put(startDate, count);
            startDate = startDate.plusDays(1);
        }

        System.out.println(dayToCount);
    }

    public enum MONTH {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        private final int monthNumber;

        MONTH(final int monthNumber) {
            this.monthNumber = monthNumber;
        }

        public int getNumberOfMonth() {
            return monthNumber;
        }
    }
}
