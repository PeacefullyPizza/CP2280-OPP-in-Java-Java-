public class InvoiceTest {
    public static void main(String[] args) {
        Invoice one = new Invoice("69X", "Toy", 20, 1.5);
        System.out.println("Part number: " + one.getPart_number() + "; Part description: " + one.getPart_description() +
                "; Sold: " + one.getQuantity() + "; Price: " + one.getPrice() + "; Invoice amount: " +
                one.getInvoiceAmount());
        one.setPart_number("420Z");
        one.setPart_description("Toy Truck");
        one.setQuantity(30);
        one.setPrice(15.99);
        System.out.println("After changing:");
        System.out.println("Part number: " + one.getPart_number() + "; Part description: " + one.getPart_description() +
                "; Sold: " + one.getQuantity() + "; Price: " + one.getPrice() + "; Invoice amount: " +
                one.getInvoiceAmount());
    }
}