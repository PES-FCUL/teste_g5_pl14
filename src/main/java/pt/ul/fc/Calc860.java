package pt.ul.fc;

/** Small utility class. */
public class Calc860 {

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return width * height;
    }

    /**
     * Returns amount multiplied by 6.
     */
    public static int multiply(int amount) {
        return amount * 6;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
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
    public static int maxOf(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isAboveZero(int n) {
        return n > 0;
    }
}
