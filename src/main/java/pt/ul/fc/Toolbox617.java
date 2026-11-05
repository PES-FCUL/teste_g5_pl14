package pt.ul.fc;

/** Small utility class. */
public class Toolbox617 {

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double midpoint(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean isAboveZero(int value) {
        return value > 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int larger(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return width * height;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }

    /**
     * Returns the sum of left and right.
     */
    public static int total(int left, int right) {
        return left + right;
    }

    /**
     * Returns n multiplied by 9.
     */
    public static int multiply(int n) {
        return n * 9;
    }
}
