/*User Story:
As an admin, I want to protect product price details so that users cannot directly modify sensitive values.

Task to Perform:
Create a Product class with private variables and getter/setter methods.

Concepts to Use:
Encapsulation, private, Getter, Setter

Expected Output:
Product details accessed securely using methods */


//step 1: Create a class named Product
class ProductEnca {

    //step 2: Declare private variables
    private int productId;
    private String productName;
    private double price;

    //step 3: Generate Getter and Setter methods

    // Setter methods
    public void setProductId(int id) {
        productId = id;
    }

    public void setProductName(String name) {
        productName = name;
    }

    public void setPrice(double p) {
        price = p;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}


//step 4: Main class to test encapsulation
public class ProductEncapsulation {

    public static void main(String[] args) {

        ProductEnca p1 = new ProductEnca();

        // Setting values using setter methods
        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setPrice(55000);

        // Getting values using getter methods
        System.out.println("Product ID: " + p1.getProductId());
        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Product Price: " + p1.getPrice());
    }
}


/*Output
Product ID: 101
Product Name: Laptop
Product Price: 55000.0
*/