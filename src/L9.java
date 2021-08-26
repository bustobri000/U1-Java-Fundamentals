import javax.swing.JOptionPane;

public class L9{

    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");


        JOptionPane.showMessageDialog(null, "Hallo " + firstName + " " + lastName + "!!");


        //ALL INPUT IS RECEIVED AS A STRING

        //PRO TIP: Variables of the same data type can be separated with a comma in the declaration

        int mph, minutes;
        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you travelling in MPH?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long in minutes did you travel?"));

        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showMessageDialog(null, "You travelled " + distance + " Miles");
        System.exit(0);
    }


}
