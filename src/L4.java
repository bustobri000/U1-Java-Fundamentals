public class L4 {
    public static void main(String[] args) {
     int value = 5;

    //Declare a variable - stating the datatype and identifier
    double total;
    String message = "Hi";
    final double GRAVITY = -9.81;

    //Assign a value
    total = 6;
    System.out.println(message + ", the value is " + total);

    total = 10;
    message = "bye";
    //GRAVITY = 10;  -- this is bad

    System.out.println(message + ", the value is " + total);
    }
}