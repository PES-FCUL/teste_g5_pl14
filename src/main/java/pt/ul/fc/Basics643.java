package pt.ul.fc;

/** Small utility class. */
public class Basics643 {

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Returns amount multiplied by 8.
     */
    public static int amplify(int amount) {
        return amount * 8;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int area(int w, int h) {
        return w*h;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String toUpper(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the absolute value of n.
     */
    public static int abs(int n) {
        return Math.abs(n);
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.max(first, second);
    }
}
