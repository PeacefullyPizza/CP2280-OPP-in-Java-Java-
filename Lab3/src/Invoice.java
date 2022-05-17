public class Invoice {
    private String part_number; // instance variable
    private String part_description; // instance variable
    private int quantity; // instance variable
    private double price; // instance variable

    public Invoice(String part_number, String part_description, int quantity, double price) {
        this.part_number = part_number; // assign name to instance variable name
        this.part_description = part_description; // assign name to instance variable name
        this.quantity = quantity; // assign name to instance variable name
        this.price = price; // assign name to instance variable name
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public String getPart_number() {
        return part_number;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public String getPart_description() {
        return part_description;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity; // assign it to instance variable balance
        } else {
            this.quantity = 0; // assign it to instance variable balance
        }
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(double price){
        if (price > 0) {
            this.price = price; // assign it to instance variable balance
        } else {
            this.price = 0; // assign it to instance variable balance
        }
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        return price * quantity;
    }
}
