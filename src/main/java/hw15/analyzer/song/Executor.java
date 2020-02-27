package hw15.analyzer.song;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Executor {

    public void demonstrateHW() throws IOException {
        Path path = new File("src/main/resources/song.txt").toPath();
        String[] textOfSong = Files.readString(path).replace("\r\n", " ").split(" ");

        Song song = new Song();

        song.showTotalWordsInSong(textOfSong);
        song.showWordsThatShouldBeRemoved(textOfSong);
        song.showFilteredSongText(textOfSong);
        song.showTheMostRepeatedWords(textOfSong, 5);
    }
}
