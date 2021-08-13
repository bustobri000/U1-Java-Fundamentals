public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int rawTime = 3666;
        int time = rawTime;
        int numHours = rawTime / 3600;
        rawTime = rawTime % 3600;
        int numMinutes = rawTime / 60;
        rawTime = rawTime % 60;
        int numSeconds = rawTime;

        System.out.println("The time is " + time);
        System.out.println("Hours: " + numHours);
        System.out.println("Minutes: " + numMinutes);
        System.out.println("Seconds: " + numSeconds);
    }
}
