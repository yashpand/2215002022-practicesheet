import java.util.Scanner;

 class LowerCaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String builtInLower = input.toLowerCase();
        String customLower = toLowerCase(input);
        boolean areEqual = compareStrings(builtInLower, customLower);
        System.out.println("Custom Lowercase: " + customLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Are both equal: " + areEqual);
    }

    static String toLowerCase(String str) {
        String result = "";
        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char)(ch + 32);
                }
                result += ch;
            } catch (Exception e) {
                break;
            }
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        int i = 0;
        while (true) {
            try {
                if (s1.charAt(i) != s2.charAt(i)) return false;
                i++;
            } catch (Exception e) {
                break;
            }
        }
        try {
            s1.charAt(i);
            return false;
        } catch (Exception e1) {
            try {
                s2.charAt(i);
                return false;
            } catch (Exception e2) {
                return true;
            }
        }
    }
}
