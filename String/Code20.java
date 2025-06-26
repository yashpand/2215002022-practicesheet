import java.util.Scanner;

 class Code20 {

    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedByCharAt = customSubstring(input, indices[0], indices[1]);
        String trimmedByBuiltIn = input.trim();

        boolean isSame = compareStrings(trimmedByCharAt, trimmedByBuiltIn);

        System.out.println("Trimmed using charAt(): \"" + trimmedByCharAt + "\"");
        System.out.println("Trimmed using built-in trim(): \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are both results same? " + isSame);
    }
}
