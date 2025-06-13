public class Main {
   void myMethod() {
    System.out.println("Hello World!");
    my();
  }
  static void my(){
    System.out.println("Hello from my method!");
    }
  public static void main(String[] args) {
    Main main = new Main();
    main.myMethod();
    my();
  }
}

// Outputs "Hello World!"