package level2;

import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

     
        while (num > 0) {
            if (index == maxDigit) {
               
                maxDigit += 10;
               
                int[] temp = new int[maxDigit];
                
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

       
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
