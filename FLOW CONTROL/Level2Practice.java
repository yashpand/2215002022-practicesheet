import java.util.Scanner;

public class Level2Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Program 1: Odd and Even Numbers from 1 to N
        System.out.println("Program 1: Odd and Even Numbers");
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println(i + (i % 2 == 0 ? " is Even" : " is Odd"));
            }
        }

        // Program 2: Bonus based on service
        System.out.println("\nProgram 2: Bonus Calculator");
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int service = input.nextInt();
        if (service > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No Bonus");
        }

        // Program 3: Multiplication table from 6 to 9
        System.out.println("\nProgram 3: Multiplication Table from 6 to 9");
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        // Program 4: FizzBuzz using for loop
        System.out.println("\nProgram 4: FizzBuzz (for loop)");
        System.out.print("Enter a positive number: ");
        int limit = input.nextInt();
        if (limit > 0) {
            for (int i = 1; i <= limit; i++) {
                if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
            }
        }

        // Program 5: FizzBuzz using while loop
        System.out.println("\nProgram 5: FizzBuzz (while loop)");
        int i = 1;
        while (i <= limit) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }

        // Program 6: Youngest and tallest among 3 friends
        System.out.println("\nProgram 6: Youngest and Tallest");
        System.out.print("Enter ages of Amar, Akbar, Anthony: ");
        int age1 = input.nextInt(), age2 = input.nextInt(), age3 = input.nextInt();
        System.out.print("Enter heights of Amar, Akbar, Anthony: ");
        double h1 = input.nextDouble(), h2 = input.nextDouble(), h3 = input.nextDouble();

        String youngest = (age1 <= age2 && age1 <= age3) ? "Amar"
                         : (age2 <= age1 && age2 <= age3) ? "Akbar" : "Anthony";
        String tallest = (h1 >= h2 && h1 >= h3) ? "Amar"
                       : (h2 >= h1 && h2 >= h3) ? "Akbar" : "Anthony";

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        // Program 7: Factors using for loop
        System.out.println("\nProgram 7: Factors (for loop)");
        System.out.print("Enter a positive number: ");
        int fNum = input.nextInt();
        for (int x = 1; x <= fNum; x++) {
            if (fNum % x == 0) System.out.println(x);
        }

        // Program 8: Factors using while loop
        System.out.println("\nProgram 8: Factors (while loop)");
        int j = 1;
        while (j <= fNum) {
            if (fNum % j == 0) System.out.println(j);
            j++;
        }

        // Program 9: Greatest factor other than itself (for loop)
        System.out.println("\nProgram 9: Greatest Factor (for loop)");
        int greatestFactor = 1;
        for (int k = fNum - 1; k >= 1; k--) {
            if (fNum % k == 0) {
                greatestFactor = k;
                break;
            }
        }
        System.out.println("Greatest factor of " + fNum + " is " + greatestFactor);

        // Program 10: Greatest factor other than itself (while loop)
        System.out.println("\nProgram 10: Greatest Factor (while loop)");
        int counter = fNum - 1;
        while (counter >= 1) {
            if (fNum % counter == 0) {
                System.out.println("Greatest factor of " + fNum + " is " + counter);
                break;
            }
            counter--;
        }

        // Program 11: Multiples of number below 100 (for loop)
        System.out.println("\nProgram 11: Multiples below 100 (for loop)");
        System.out.print("Enter a number < 100: ");
        int mul = input.nextInt();
        for (int m = 100; m >= 1; m--) {
            if (m % mul == 0) System.out.println(m);
        }

        // Program 12: Power of a number using for loop
        System.out.println("\nProgram 12: Power of a number (for loop)");
        System.out.print("Enter base and exponent: ");
        int base = input.nextInt(), power = input.nextInt();
        int result = 1;
        for (int p = 1; p <= power; p++) {
            result *= base;
        }
        System.out.println(base + "^" + power + " = " + result);

        // Program 13: Multiples below 100 (while loop)
        System.out.println("\nProgram 13: Multiples below 100 (while loop)");
        int count = 100;
        while (count >= 1) {
            if (count % mul == 0) System.out.println(count);
            count--;
        }

        // Program 14: Power of number using while loop
        System.out.println("\nProgram 14: Power using while loop");
        int res = 1, temp = 0;
        while (temp < power) {
            res *= base;
            temp++;
        }
        System.out.println(base + "^" + power + " = " + res);

        input.close();
    }
}
