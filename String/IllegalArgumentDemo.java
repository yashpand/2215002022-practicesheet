import java.util.Scanner;

class IllegalArgumentDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

               handleException(input);
    }

    static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred: " + e.getMessage());
        }
    }
}
