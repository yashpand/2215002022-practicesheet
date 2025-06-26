import java.util.Scanner;

 class StringIndexDemo {
    public static void generateException(String str) {
        char ch = str.charAt(str.length()); // This will throw StringIndexOutOfBoundsException
    }

    public static void handleException(String str) {
        try {
            char ch = str.charAt(str.length()); // Out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        generateException(input);
        handleException(input);
    }
}
