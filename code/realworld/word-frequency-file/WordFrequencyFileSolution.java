import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class WordFrequencyFileSolution {

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

            for (String line : lines) {
                for (String word : line.split(" ")) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }

            HashSet<String> alreadyPrinted = new HashSet<>();
            System.out.println("Top 3 words:");
            for (int rank = 1; rank <= 3; rank++) {
                String topWord = null;
                int topCount = 0;

                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    if (alreadyPrinted.contains(entry.getKey())) {
                        continue;
                    }
                    if (entry.getValue() > topCount) {
                        topCount = entry.getValue();
                        topWord = entry.getKey();
                    }
                }

                if (topWord != null) {
                    System.out.println(rank + ". " + topWord + " (" + topCount + "x)");
                    alreadyPrinted.add(topWord);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read/write " + file + ": " + e.getMessage());
        }
    }
}
