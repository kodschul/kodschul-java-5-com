import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadDemo {

    public static void main(String[] args) {
        Path file = Path.of("players.txt");

        try {
            List<String> lines = Files.readAllLines(file);
            System.out.println("Read " + lines.size() + " lines:");
            for (String line : lines) {
                String[] parts = line.split(":");
                System.out.println(parts[0] + " needed " + parts[1] + " attempts");
            }
        } catch (IOException e) {
            System.out.println("Could not read " + file + " - run FileWriteDemo.java first.");
        }
    }
}
