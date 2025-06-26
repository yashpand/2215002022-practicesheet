import java.util.Scanner;

 class WordLengthTable {

    
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    
    public static String[] splitWords(String text) {
        String[] words = new String[100]; // Assume max 100 words
        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words[wordIndex++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            words[wordIndex++] = word;
        }

        
        String[] result = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            result[i] = words[i];
        }
        return result;
    }

    
    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = getStringLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length); // Convert length to String
        }
        return result;
    }

    
    public static void displayTable(String[][] data) {
        System.out.println("Word\t\tLength");
        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]); // Convert String to int
            System.out.println(data[i][0] + "\t\t" + length);
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengthArray = getWordLengthArray(words);
        displayTable(wordLengthArray);
    }
}
