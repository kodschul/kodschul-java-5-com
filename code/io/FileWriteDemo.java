import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// Run this before FileReadDemo.java - it writes the file that FileReadDemo reads.
public class FileWriteDemo {

    public static void main(String[] args) {
        Path file = Path.of("players.txt");
        List<String> lines = List.of("Anna:4", "Ben:7", "Cem:2");

        try {
            Files.write(file, lines, StandardCharsets.UTF_8);
            System.out.println("Wrote " + lines.size() + " lines to " + file.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Could not write file: " + e.getMessage());
        }
    }
}
