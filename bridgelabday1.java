import java.util.Scanner;

public class BridgeLabzPrograms {

    public static void main(String[] args) {
        welcomeMessage();
        addTwoNumbers();
        celsiusToFahrenheit();
        areaOfCircle();
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Bridgelabz!");
    }

    public static void addTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    public static void areaOfCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = 3.14* radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}
