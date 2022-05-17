import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double product1 = 0, product2 = 0, product3 = 0, product4 = 0, product5 = 0; // set products
        double price1 = 2.98, price2 = 4.50, price3 = 9.98, price4 = 4.49, price5 = 6.87; // set prices
        int productID = 1; // set product ID
        while (productID != 0) {
            System.out.printf("Enter the Product number(1 - 5),%nor 0 to exit: "); // prompt
            productID = input.nextInt();
            if (productID >= 1 && productID <= 5) {
                System.out.printf("Enter the quantity of the product you would like to purchase:%n"); // prompt
                int quantity = input.nextInt();
                switch (productID) {
                    case 1:
                        product1 = product1 + quantity * price1; // get total of product1 & amount purchased
                        break;
                    case 2:
                        product2 = product2 + quantity * price2; // get total of product2 & amount purchased
                        break;
                    case 3:
                        product3 = product3 + quantity * price3; // get total of product3 & amount purchased
                        break;
                    case 4:
                        product4 = product4 + quantity * price4; // get total of product4 & amount purchased
                        break;
                    case 5:
                        product5 = product5 + quantity * price5; // get total of product5 & amount purchased
                        break;
                }
            }
        }
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.CANADA); // set the money format
        System.out.println("Product 1 total: " + money.format(product1)); // display total1 formatted to currency
        System.out.println("Product 2 total: " + money.format(product2)); // display total2 formatted to currency
        System.out.println("Product 3 total: " + money.format(product3)); // display total3 formatted to currency
        System.out.println("Product 4 total: " + money.format(product4)); // display total4 formatted to currency
        System.out.println("Product 5 total: " + money.format(product5)); // display total5 formatted to currency
    }
}