import java.util.Scanner;

public class code3 {
    

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int[] table = new int[10];

    for (int i = 1; i <= 10; i++) {
        table[i - 1] = number * i;
    }

    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " * " + i + " = " + table[i - 1]);
    }
    scanner.close();
}}