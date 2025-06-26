import java.util.Scanner;

 class TextSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] builtInSplit = input.split(" ");
        String[] customSplit = customSplit(input);
        boolean areEqual = compareArrays(builtInSplit, customSplit);
        System.out.println("Custom split equals built-in split: " + areEqual);
    }

    static int getLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }
        return length;
    }

    static String[] customSplit(String s) {
        int length = getLength(s);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[i] = "";
            for (int j = start; j < end; j++) {
                words[i] += s.charAt(j);
            }
            start = end + 1;
        }
        words[wordCount - 1] = "";
        for (int i = start; i < length; i++) {
            words[wordCount - 1] += s.charAt(i);
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
