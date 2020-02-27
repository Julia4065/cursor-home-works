package hw15.analyzer.song;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Song {
    public void showTotalWordsInSong(String[] textOfSong) {
        System.out.println("Total quantity of words in song: " + textOfSong.length);
    }

    public void showWordsThatShouldBeRemoved(String[] textOfSong) {
        List<String> wordsToBeRemoved = Arrays.stream(textOfSong).filter(word -> (word.length() < 3 && word.length() >= 1)).collect(Collectors.toList());
        System.out.println("Total number of words that should be removed is " + wordsToBeRemoved.size());
        System.out.println("Words to be removed: " + wordsToBeRemoved);
    }

    public void showFilteredSongText(String[] textOfSong) {
        List<String> filteredSongText = Arrays.stream(textOfSong).filter(word -> (word.length() >= 3)).collect(Collectors.toList());
        System.out.println("Song without short words: " + filteredSongText);
    }

    public void showTheMostRepeatedWords(String[] textOfSong, int count) {
        Map<String, Integer> songWordsWithUsedTimes = Arrays.stream(textOfSong).filter(word -> !word.equals("")).collect(toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        LinkedHashMap<String, Integer> sortedSongWordsWithUsedTimes = songWordsWithUsedTimes.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        List<String> firstNWordsFromSongThatOftenUsed = sortedSongWordsWithUsedTimes.keySet().stream().limit(count).collect(Collectors.toList());
        System.out.println("First " + count + " words, that repeats very often: " + firstNWordsFromSongThatOftenUsed);
    }
}
