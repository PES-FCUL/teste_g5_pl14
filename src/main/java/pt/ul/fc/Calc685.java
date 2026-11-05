package pt.ul.fc;

/** Small utility class. */
public class Calc685 {

    /**
     * Returns word converted to upper case.
     */
    public static String toUpper(String word) {
        return word.toUpperCase();
    }

    /**
     * Returns the absolute value of value.
     */
    public static int distanceFromZero(int value) {
        return Math.abs(value);
    }

    /**
     * Returns true if n is even, false otherwise.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Returns the sum of left and right.
     */
    public static int sum(int left, int right) {
        return left + right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Returns the area of a rectangle with the given width and height.
     */
    public static int surface(int width, int height) {
        return width * height;
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double avg(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns amount multiplied by 8.
     */
    public static int multiply(int amount) {
        return amount * 8;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean isAboveZero(int number) {
        return number > 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int pickMax(int first, int second) {
        return Math.max(first, second);
    }
}
