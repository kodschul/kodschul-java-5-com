import java.util.HashMap;
import java.util.Map;

public class WordFrequencySolution {

    public static void main(String[] args) {
        String sentence = "the cat sat on the mat the cat ran";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String mostFrequentWord = null;
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println("Most frequent: " + mostFrequentWord + " (" + highestCount + "x)");
    }
}
