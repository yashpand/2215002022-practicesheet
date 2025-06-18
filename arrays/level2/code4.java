package level2;

import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10; // initial size
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (num > 0) {
            if (index == maxDigit) {
                // Increase maxDigit by 10
                maxDigit += 10;
                // Create new temp array
                int[] temp = new int[maxDigit];
                // Copy old digits to temp
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                // Assign temp to digits
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        // Find largest and second largest
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}
