public class SwitchDemo {

    public static void main(String[] args) {
        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };
        System.out.println("Day " + day + " is " + dayName);

        // classic switch with fall-through (each case needs its own break)
        String difficulty = "2";
        switch (difficulty) {
            case "1":
                System.out.println("Easy");
                break;
            case "2":
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown difficulty");
        }
    }
}
