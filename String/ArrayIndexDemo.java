import java.util.Scanner;

 class ArrayIndexDemo {
    public static void generateException(String[] names) {
        String value = names[names.length]; // This will throw ArrayIndexOutOfBoundsException
    }

    public static void handleException(String[] names) {
        try {
            String value = names[names.length]; // Out of bounds access
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.next();
        }

        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main(): " + e);
        }

        handleException(names);
    }
}
