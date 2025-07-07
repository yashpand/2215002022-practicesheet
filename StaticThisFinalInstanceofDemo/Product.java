package Keyword;

public class Product {



        static double discount = 10.0;

        private final int productID;
        private String productName;
        private double price;
        private int quantity;


        public Product(int productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }


        public static void updateDiscount(double newDiscount) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        }


        public double calculateFinalPrice() {
            return price * quantity * (1 - discount / 100);
        }


        public void displayDetails() {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price after Discount: ₹" + calculateFinalPrice());
        }


        public static void main(String[] args) {
            Product p1 = new Product(201, "Bluetooth Speaker", 1500.0, 2);
            Product p2 = new Product(202, "Wireless Mouse", 700.0, 3);


            Product.updateDiscount(15.0);

            System.out.println();


            if (p1 instanceof Product) {
                p1.displayDetails();
            }

            System.out.println();

            if (p2 instanceof Product) {
                p2.displayDetails();
            }
        }
    }





