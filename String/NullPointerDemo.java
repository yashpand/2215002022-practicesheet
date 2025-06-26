  class NullPointerDemo {
    public static void generateException() {
        String text = null;
        int length = text.length(); // This will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            int length = text.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught in handleException(): " + e);
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main(): " + e);
        }
        handleException();
    }
}
