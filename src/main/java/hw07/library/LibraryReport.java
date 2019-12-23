package hw07.library;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class LibraryReport {

    private Map<LocalDate, String> libraryReport = new HashMap<>();
    private Map<LocalDate, List<String>> libraryReportForMultipleBooksTaken = new HashMap<>();

    public void takeABook(LocalDate date, String bookTitle) {
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

    public void takeFewBooks(LocalDate date, List<String> bookTitles) {
        libraryReportForMultipleBooksTaken.put(date, bookTitles);
    }

    public void countBooksThatWereTakenForTheMonth(MONTH month) {
        Map<LocalDate, Long> datesWithCountedBooksThatWereTaken = libraryReportForMultipleBooksTaken.entrySet().stream()
                .collect(toMap(date -> date.getKey(), books -> books.getValue().stream().count()));
        Map<LocalDate, Long> allDates = findAllDatesInMonth(2019, month.getNumberOfMonth()).stream()
                .collect(toMap(key -> key, val -> 0L));

        Map<LocalDate, Long> countedBooksForTheMonth = new HashMap<>(datesWithCountedBooksThatWereTaken);
        allDates.forEach((k, v) -> countedBooksForTheMonth.merge(k, v, Long::max));

        LinkedHashMap<LocalDate, Long> sortedCountedBooksForTheMonth = countedBooksForTheMonth.entrySet().stream()
                .sorted(comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("How many books were borrowed day by day for the month " + month);
        System.out.println(sortedCountedBooksForTheMonth);
    }

    private List<LocalDate> findAllDatesInMonth(int year, int month) {
        List<LocalDate> datesInMonth = new ArrayList<>();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 0);

        int daysInMonth = YearMonth.of(year, month).lengthOfMonth();
        for (int i = 0; i < daysInMonth; i++) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            datesInMonth.add(LocalDate.parse(fmt.format(cal.getTime())));
        }
        return datesInMonth;
    }

    public enum MONTH {
        OCTOBER(10);

        private final int value;

        MONTH(final int value) {
            this.value = value;
        }

        public int getNumberOfMonth() {
            return value;
        }
    }
}
