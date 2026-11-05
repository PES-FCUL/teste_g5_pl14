package pt.ul.fc;

/** Small utility class. */
public class Helpers642 {

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double avg(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String shout(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the absolute value of value.
     */
    public static int magnitude(int value) {
        return Math.abs(value);
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double cToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns n multiplied by 3.
     */
    public static int multiply(int n) {
        return n * 3;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int surface(int base, int side) {
        return base * side;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }
    
    public static boolean divisibleByTwo(int n) {
        return n % 2 == 0;
    }

    public static int sum(int left, int right) {
        return left + right;
    }
}
