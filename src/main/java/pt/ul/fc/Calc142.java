package pt.ul.fc;

/** Small utility class. */
public class Calc142 {

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Returns amount multiplied by 9.
     */
    public static int amplify(int amount) {
        return amount * 9;
    }

    /**
     * Returns the area of a rectangle with the given w and h.
     */
    public static int surface(int w, int h) {
        return w * h;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double celsiusToF(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int plus(int x, int y) {
        return x + y;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int maxOf(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns word converted to upper case.
     */
    public static String loud(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean even(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double mean(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int magnitude(int n) {
        return Math.abs(n);
    }
}
