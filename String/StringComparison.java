import java.util.Scanner;

 class StringComparison {
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        boolean resultCharAt = compareWithCharAt(str1, str2);
        boolean resultEquals = str1.equals(str2);
        System.out.println(resultCharAt == resultEquals);
    }
}
