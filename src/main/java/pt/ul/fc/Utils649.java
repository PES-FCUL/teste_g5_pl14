package pt.ul.fc;

/** Small utility class. */
public class Utils649 {

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
     * Returns the arithmetic mean of a and b.
     */
    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int absolute(int value) {
        return Math.abs(value);
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean hasEvenParity(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean greaterThanZero(int number) {
        return number > 0;
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns n multiplied by 6.
     */
    public static int scale(int n) {
        return n * 6;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int rectArea(int width, int height) {
        return width * height;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }
}
