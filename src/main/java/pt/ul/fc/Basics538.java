package pt.ul.fc;

/** Small utility class. */
public class Basics538 {

    /**
     * Returns the absolute value of value.
     */
    public static int abs(int value) {
        return Math.abs(value);
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the sum of x and y.
     */
    public static int total(int x, int y) {
        return x + y;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns value multiplied by 6.
     */
    public static int multiply(int value) {
        return value * 6;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int rectArea(int base, int side) {
        return base * side;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }
}
