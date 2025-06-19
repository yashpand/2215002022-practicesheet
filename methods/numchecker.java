public class numchecker {

    public static void main(String[] args) {
        int number = 12321; 
        int[] digits = NumberChecker.getDigits(number);
        int count = digits.length;

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);

        int[] reversedDigits = NumberChecker.reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversedDigits) {
            System.out.print(d);
        }
        System.out.println();

        boolean isPalindrome = NumberChecker.isPalindrome(digits);
        boolean isDuck = NumberChecker.isDuck(digits);

        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
    }
}

class NumberChecker {

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
s
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

   
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    
    public static boolean isDuck(int[] digits) {
       
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
