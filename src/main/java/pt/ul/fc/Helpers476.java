package pt.ul.fc;

/** Small utility class. */
public class Helpers476 {

    /**
     * Returns the sum of x and y.
     */
    public static int plus(int x, int y) {
        return x + y;
    }

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double midpoint(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Returns the larger of a and b.
     */
    public static int maxOf(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Returns the absolute value of number.
     */
    public static int distanceFromZero(int number) {
        return Math.abs(number);
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return (w * h);
    }

    /**
     * Returns s converted to upper case.
     */
    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 = 0;
    }

    /**
     * Returns value multiplied by 4.
     */
    public static int multiply(int value) {
        return value * 4;
    }
}
