package pt.ul.fc;

/** Small utility class. */
public class Calc628 {

    /**
     * Returns the arithmetic mean of a and b.
     */
    public static double midpoint(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns n multiplied by 4.
     */
    public static int amplify(int n) {
        return n * 4;
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean hasEvenParity(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
        return Math.abs(n);
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the sum of a and b.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return width * height;
    }
}
