import java.util.ArrayList;
import java.util.HashMap;

public class GradeBookSolution {

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

        String highestName = null;
        String lowestName = null;
        double highestAverage = Double.NEGATIVE_INFINITY;
        double lowestAverage = Double.POSITIVE_INFINITY;

        for (Student student : students.values()) {
            double average = student.getAverage();
            String result = average >= 50 ? "Passed" : "Failed";
            System.out.printf("%s: %.2f (%s)%n", student.getName(), average, result);

            if (average > highestAverage) {
                highestAverage = average;
                highestName = student.getName();
            }
            if (average < lowestAverage) {
                lowestAverage = average;
                lowestName = student.getName();
            }
        }

        System.out.println("Highest average: " + highestName);
        System.out.println("Lowest average: " + lowestName);
    }
}
