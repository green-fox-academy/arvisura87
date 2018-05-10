public class SecondsInADay13 {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int hoursSec = ((24-currentHours)*(60*60));
        int minutesSec = ((60-currentMinutes)*60);
        int secondsSec = (60-currentSeconds);

        System.out.println(hoursSec+minutesSec+secondsSec);
    }
}
