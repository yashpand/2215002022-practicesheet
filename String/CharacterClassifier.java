import java.util.Scanner;

 class CharacterClassifier {

    
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
        return ch;
    }

    
    public static String checkCharType(char ch) {
        ch = toLower(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    
    public static String[][] analyzeCharacters(String input) {
        int len = input.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    
    public static void displayResult(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "\t\t" + data[i][1]);
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] analysis = analyzeCharacters(input);
        displayResult(analysis);
    }
}
