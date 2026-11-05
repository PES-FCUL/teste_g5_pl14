package pt.ul.fc;

/** Small utility class. */
public class Utils153 {

    /**
     * Returns true if value is strictly greater than zero.
     */
    public static boolean greaterThanZero(int value) {
        return value > 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int pickMax(int first, int second) {
        return Math.max(first, second);
    }

    /**
     * Returns the sum of x and y.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns s converted to upper case.
     */
    public static String loud(String s) {
        return s.toUpperCase();
    }

    /**
     * Returns the arithmetic mean of first and second.
     */
    public static double average(double first, double second) {
        return (first + second) / 2.0;
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean divisibleByTwo(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int area(int base, int side) {
        return base * side;
    }

    /**
     * Returns value multiplied by 7.
     */
    public static int scale(int value) {
        return value * 7;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int distanceFromZero(int n) {
        return Math.abs(n);
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0 + 32.0;
    }
}
