package hw08.user;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class UserFilter {

    public void findUserMailsWhoLoggedInWeekAgoGroupedByTeams(List<User> users) {
        Map<String, List<String>> filteredUsers = users.stream()
                .filter(p -> p.getLoginDate().isAfter(LocalDate.now().minusDays(7)))
                .collect(groupingBy(User::getTeam, mapping(User::getEmail, toList())));

        System.out.println("User's mails who logged in for the last week grouped by teams: ");
        System.out.println(filteredUsers);
    }
}
