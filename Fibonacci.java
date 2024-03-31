
public class Fibonacci {
    public static void main(String[] args) {
        
        int limit = 5;

        System.out.println("Fibonacci numbers up to " + limit + ":");
        generateFibonacci(limit);
    }

    public static void generateFibonacci(int limit) {
        int a = 0;
        int b = 1;

        while (a <= limit) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}