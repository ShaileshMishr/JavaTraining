// Create a class named "Product" with fields like prodId, prodName, category and price.
// Create List of products and display total of all those products that comes under "electronics" category

package JavaBasics.src.Day9Java8;

public class Product {

    private int prodId;
    private String prodName;
    private String category;
    private double price;

    public Product(int prodId, String prodName, String category, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.category = category;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
