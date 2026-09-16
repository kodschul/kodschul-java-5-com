import java.util.HashMap;

// Exercise: count how often each word appears in a sentence using a HashMap.
public class WordFrequencyExercise {

    public static void main(String[] args) {
        String sentence = "the cat sat on the mat the cat ran";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        // TODO 1: for each word in "words", increase its count in wordCounts by 1.
        // Hint: wordCounts.getOrDefault(word, 0) gives you the current count
        // (or 0 if the word hasn't been seen yet).

        // TODO 2: print every word together with its count, one line per word.

        // TODO 3 (bonus): find and print the word with the highest count.
    }
}
