public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double rawPrice = 60.00;
        double rawDiscount = 20.00;

        double discount = 1 - rawDiscount/100.00;

        double price =  rawPrice * discount;
        System.out.println("Price is : " + price);
    }
}
