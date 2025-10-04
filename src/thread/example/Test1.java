package thread.example;

public class Test1 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch: " + e);
        } finally {
            throw new RuntimeException("From finally");
        }
    }
}
