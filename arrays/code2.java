import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is ");
            if (num > 0) {
                String parity = (num % 2 == 0) ? "even" : "odd";
                System.out.println("positive and " + parity + ".");
            } else if (num < 0) {
                System.out.println("negative.");
            } else {
                System.out.println("zero.");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("First element (" + first + ") is ");
        if (first == last) {
            System.out.println("equal to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("greater than last element (" + last + ").");
        } else {
            System.out.println("less than last element (" + last + ").");
        }

        sc.close();
    }
}
