public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven Project!");
        System.out.println("1 + 2 = " + add(1, 2));
        System.out.println("5 - 3 = " + subtract(5, 3));
        System.out.println("4 * 2 = " + multiply(4, 2));
        System.out.println("8 / 2 = " + divide(8, 2));
        try {
            System.out.println("8 / 0 = " + divide(8, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: 8 / 0 = divide by zero");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}