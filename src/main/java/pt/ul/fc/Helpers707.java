package pt.ul.fc;

/** Small utility class. */
public class Helpers707 {

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int areaOf(int width, int height) {
        return width * height;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String shout(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the sum of left and right.
     */
    public static int plus(int left, int right) {
        return left + right;
    }

    /**
     * Returns the absolute value of value.
     */
    public static int magnitude(int value) {
        return Math.abs(value);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns value multiplied by 3.
     */
    public static int multiply(int value) {
        return value * 3;
    }

    /**
     * Returns the larger of x and y.
     */
    public static int pickMax(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double midpoint(double first, double second) {
        return (first + second) / 2.0;
    }
}
