import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {
        //Create a Scanner object to read input
        Scanner read = new Scanner(System.in);

       /* String name;
        int hours;
        double payRate;
        double grossPay;

        //Get the user's name
        System.out.println("What is your name?");
        name = read.nextLine();

        //Get the number of hours worked
        System.out.println("How many hours did you work?");
        hours = read.nextInt();

        //Get the user's hourly rate
        System.out.println("What is your hourly pay rate?");
        payRate = read.nextDouble();

        //Calculate the gross pay
        grossPay = hours * payRate;

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);*/

        //Big bad Bugaboom #1 - Hanging Carriage
     /*   int age;
        String name;

        System.out.println("How old are you?");
        age = read.nextInt();

       // read.nextLine(); //eats up the hanging carriage

        System.out.println("What is your name?");
        name = read.next();

        System.out.println("Hello " + name + ". You are " + age + " years old.");*/

        //Bugs bunny # 2 - Tokens

        String firstName;
        String lastName;

        System.out.print("enter your full name (all on one line, press ENTER when finished):");
        firstName = read.next();
        lastName = read.nextLine();
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}
