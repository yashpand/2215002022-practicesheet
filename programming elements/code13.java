import java.util.Scanner;

public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n",
                totalPrice, quantity, unitPrice);
    }
}