package praktikumNV;

public class Invoice implements Payable{
    
    private String productName;
    private int quantity;
    private int pricePerItem;

    // Constructor
    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Implementasi dari interface Payable
    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    // Getter untuk nama produk
    public String getProductName() {
        return productName;
    }

    // Getter untuk jumlah
    public int getQuantity() {
        return quantity;
    }

    // Getter untuk harga per item
    public int getPricePerItem() {
        return pricePerItem;
    }
}
