package pt.ul.fc;

/** Small utility class. */
public class Helpers362 {

    /**
     * Returns the sum of left and right.
     */
    public static int add(int left, int right) {
        return left + right;
    }

    /**
     * Returns amount multiplied by 7.
     */
    public static int times(int amount) {
        return amount * 7;
    }

    /**
     * Returns true if value is even, false otherwise.
     */
    public static boolean even(int value) {
        return value % 2 == 0;
    }

    /**
     * Returns true if n is strictly greater than zero.
     */
    public static boolean positive(int n) {
        return n > 0;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double midpoint(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns text converted to upper case.
     */
    public static String loud(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int areaOf(int base, int side) {
        return base * side;
    }

    /**
     * Returns the absolute value of number.
     */
    public static int magnitude(int number) {
        return Math.abs(number);
    }
}
