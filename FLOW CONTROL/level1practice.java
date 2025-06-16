import java.util.Scanner;

public class level1practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Code #1: Check if number is divisible by 5
        System.out.println("\nCode #1: Check if number is divisible by 5");
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Is the number " + num1 + " divisible by 5? " + (num1 % 5 == 0));

        // Code #2: Check if first is smallest of 3 numbers
        System.out.println("\nCode #2: Check if first is smallest of 3 numbers");
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));

        // Code #3: Check which number is largest
        System.out.println("\nCode #3: Check which number is largest");
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));

        // Code #4: Sum of n natural numbers if valid
        System.out.println("\nCode #4: Sum of n natural numbers if valid");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        // Code #5: Check voting eligibility
        System.out.println("\nCode #5: Check voting eligibility");
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Code #6: Check if number is positive, negative, or zero
        System.out.println("\nCode #6: Check if number is positive, negative, or zero");
        System.out.print("Enter a number: ");
        int value = sc.nextInt();
        if (value > 0)
            System.out.println("Positive");
        else if (value < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        // Code #7: Check if it’s Spring Season
        System.out.println("\nCode #7: Check if it’s Spring Season");
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");

        // Code #8: Countdown using while loop
        System.out.println("\nCode #8: Countdown using while loop");
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");

        // Code #9: Countdown using for loop
        System.out.println("\nCode #9: Countdown using for loop");
        System.out.print("Enter countdown start value: ");
        int countDown = sc.nextInt();
        for (int i = countDown; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");

        // Code #10: Sum until user enters 0
        System.out.println("\nCode #10: Sum until user enters 0");
        double total = 0.0;
        while (true) {
            System.out.print("Enter number (0 to stop): ");
            double value10 = sc.nextDouble();
            if (value10 == 0) break;
            total += value10;
        }
        System.out.println("Total sum: " + total);

        // Code #11: Sum until 0 or negative (using break)
        System.out.println("\nCode #11: Sum until 0 or negative using break");
        double sum11 = 0.0;
        while (true) {
            System.out.print("Enter number (0 or negative to stop): ");
            double input = sc.nextDouble();
            if (input <= 0) break;
            sum11 += input;
        }
        System.out.println("Total sum: " + sum11);

        // Code #12: Sum of n natural numbers using while + formula
        System.out.println("\nCode #12: Sum of n natural numbers using while loop");
        System.out.print("Enter a number: ");
        int n12 = sc.nextInt();
        int sumWhile = 0;
        int temp = 1;
        while (temp <= n12) {
            sumWhile += temp;
            temp++;
        }
        int sumFormula = n12 * (n12 + 1) / 2;
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using while loop: " + sumWhile);

        // Code #13: Same as Code 12 but using for loop
        System.out.println("\nCode #13: Sum of n natural numbers using for loop");
        System.out.print("Enter a number: ");
        int n13 = sc.nextInt();
        int sumFor = 0;
        for (int i = 1; i <= n13; i++) {
            sumFor += i;
        }
        int sumFormula13 = n13 * (n13 + 1) / 2;
        System.out.println("Sum using formula: " + sumFormula13);
        System.out.println("Sum using for loop: " + sumFor);

        // Code #14: Factorial using while loop
        System.out.println("\nCode #14: Factorial using while loop");
        System.out.print("Enter a number: ");
        int factNum = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= factNum) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + factNum + " is " + factorial);

        // Code #15: Factorial using for loop
        System.out.println("\nCode #15: Factorial using for loop");
        System.out.print("Enter a number: ");
        int factNum2 = sc.nextInt();
        int factorial2 = 1;
        for (int j = 1; j <= factNum2; j++) {
            factorial2 *= j;
        }
        System.out.println("Factorial of " + factNum2 + " is " + factorial2);

        // Code #16: Print odd and even numbers up to N
        System.out.println("\nCode #16: Print odd and even numbers up to N");
        System.out.print("Enter a number: ");
        int limit = sc.nextInt();
        for (int x = 1; x <= limit; x++) {
            if (x % 2 == 0)
                System.out.println(x + " is even");
            else
                System.out.println(x + " is odd");
        }

        // Code #17: Employee bonus based on years of service
        System.out.println("\nCode #17: Bonus calculation");
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus. Less than or equal to 5 years of service.");
        }

        // Code #18: Multiplication table from 6 to 9
        System.out.println("\nCode #18: Multiplication table from 6 to 9");
        System.out.print("Enter a number: ");
        int multNum = sc.nextInt();
        for (int m = 6; m <= 9; m++) {
            System.out.println(multNum + " * " + m + " = " + (multNum * m));
        }

        sc.close();
    }
}
