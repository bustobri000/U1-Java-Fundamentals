public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */
    public static void main(String[] args) {
        int testScore1 = 12;
        int testScore2 = 138888;
        int testScore3 = -5000000;
        int testScore4 = 199;

       int sumTotal = testScore1 + testScore2 + testScore3 + testScore4;
       double average = sumTotal / 4.0;

        System.out.println("The average is " + average);

    }

}
