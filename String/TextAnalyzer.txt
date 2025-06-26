import java.util.Scanner;

 class TextAnalyzer {

    // Method 1: Split text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        String[] words = new String[100]; // assuming max 100 words
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                currentWord += c;
            } else {
                if (!currentWord.equals("")) {
                    words[wordCount++] = currentWord;
                    currentWord = "";
                }
            }
        }

        // Add last word if there is any
        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord;
        }

        // Create final array of actual word count
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }

        return result;
    }

    // Method 2: Find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // Method 3: Create 2D array with word and its length
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = getStringLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    // Method 4: Find shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordInfo) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < wordInfo.length; i++) {
            int length = Integer.parseInt(wordInfo[i][1]);
            if (length < min) {
                min = length;
            }
            if (length > max) {
                max = length;
            }
        }

        return new int[]{min, max};
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextIntoWords(inputText);
        String[][] wordInfo = getWordsWithLengths(words);
        int[] result = findShortestAndLongest(wordInfo);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
}
