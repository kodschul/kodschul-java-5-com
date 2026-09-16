import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class WordFrequencyFileStarter {

    public static void main(String[] args) {
        Path file = Path.of("notes.txt");
        List<String> sampleLines = List.of(
                "the quick brown fox jumps over the lazy dog",
                "the dog barks at the fox",
                "the fox runs away quickly");

        try {
            if (!Files.exists(file)) {
                Files.write(file, sampleLines, StandardCharsets.UTF_8);
            }

            List<String> lines = Files.readAllLines(file);
            HashMap<String, Integer> wordCounts = new HashMap<>();

            // TODO 1: for every line, split it by " " into words, and for every word
            // increase its count in "wordCounts" by 1 (use getOrDefault(word, 0)).

            // TODO 2: find and print the top 3 most frequent words. Hint: loop 3 times;
            // each time, find the word with the highest count that isn't already
            // in a "HashSet<String> alreadyPrinted", print it, then add it to
            // alreadyPrinted so it isn't picked again.

        } catch (IOException e) {
            System.out.println("Could not read/write " + file + ": " + e.getMessage());
        }
    }
}
