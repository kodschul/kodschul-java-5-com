import java.util.ArrayList;
import java.util.HashMap;

public class GradeBookStarter {

    static class Student {

        private final String name;
        private final ArrayList<Integer> scores;

        Student(String name, ArrayList<Integer> scores) {
            this.name = name;
            this.scores = scores;
        }

        String getName() {
            return name;
        }

        double getAverage() {
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            return sum / (double) scores.size();
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("Anna", new Student("Anna", new ArrayList<>(java.util.List.of(85, 90, 78))));
        students.put("Ben", new Student("Ben", new ArrayList<>(java.util.List.of(40, 55, 60))));
        students.put("Cem", new Student("Cem", new ArrayList<>(java.util.List.of(95, 92, 88))));

        // TODO 1: for every student in "students", print name, average (use
        // String.format("%.2f", ...) or printf), and "Passed"/"Failed"
        // (average >= 50 is a pass).

        // TODO 2: find the student with the highest average and the student with the
        // lowest average across all of "students", and print both names.
    }
}
