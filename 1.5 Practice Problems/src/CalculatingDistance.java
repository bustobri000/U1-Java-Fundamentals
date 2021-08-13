public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */
    public static void main(String[] args) {
        int milesPerHour = 55;
        int minuteTime = 45;
        double time = minuteTime / 60.0;

        double distanceTravelled = time * milesPerHour;
        System.out.println("Travelled: " + distanceTravelled + " miles");
    }

}
