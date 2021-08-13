public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */
    public static void main(String[] args) {

        //declare and initialize variables
        double price = 9.99;
        int quantity = 6;
        double _tax = 7;
        final double TAX = _tax/100.0;

        //calculations

        double subTotal = quantity * price;
        double taxTotal = subTotal * TAX;
        double totalCost = subTotal + taxTotal;

        System.out.println("You were scammed " + quantity + " objects and charged " + price + " per object.");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + taxTotal);
        System.out.println("Total: " + totalCost);

        // DISCOUNTS AND INCREASES

        //FORMULA: AMOUNT * (1 +/- PERCENTAGE) = TOTAL
    }

}