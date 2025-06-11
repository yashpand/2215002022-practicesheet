import java.util.Scanner;

public class BasicPrograms {

    public static void main(String[] args) {
        calculateSimpleInterest();
        perimeterOfRectangle();
        powerCalculation();
        calculateAverageOfThreeNumbers();
    }

    public static void calculateSimpleInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }

    public static void perimeterOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    public static void powerCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter Exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    public static void calculateAverageOfThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
}
