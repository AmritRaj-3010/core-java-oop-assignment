/*User Story:
As an admin, I want to calculate bill for purchased products so that I can know total cost.

Task to Perform:
Create ProductBilling class and implement overloaded methods for billing 1, 2, and 3 products.

Concepts to Use:
Methods, Parameters, Method Overloading, Polymorphism

Expected Output:
Bill calculated for different number of products */


//step 1: Create a class named ProductBilling
public class ProductBilling {

    //step 2: Create overloaded methods for different number of products

    // Method for 1 product
    void calculateBill(int price1) {
        int total = price1;
        System.out.println("Total Bill for 1 product: " + total);
    }

    // Method for 2 products
    void calculateBill(int price1, int price2) {
        int total = price1 + price2;
        System.out.println("Total Bill for 2 products: " + total);
    }

    // Method for 3 products
    void calculateBill(int price1, int price2, int price3) {
        int total = price1 + price2 + price3;
        System.out.println("Total Bill for 3 products: " + total);
    }

    //step 3: Main method to call overloaded methods
    public static void main(String[] args) {

        ProductBilling pb = new ProductBilling();

        // Calling methods
        pb.calculateBill(100);
        pb.calculateBill(100, 200);
        pb.calculateBill(100, 200, 300);
    }
}


/*Output
Total Bill for 1 product: 100
Total Bill for 2 products: 300
Total Bill for 3 products: 600
*/