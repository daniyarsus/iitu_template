package week6;

public class CustomMath implements ICustomMath {
    public static void main(String[] args) {
        CustomMath customMath = new CustomMath();

        float Pi = (float) customMath.pi(1000);

        System.out.println(customMath.power(5, 2));
        System.out.println(customMath.exp(10));
        System.out.println(customMath.factorial(5));
        System.out.println(customMath.sqrt(25));
        System.out.println(customMath.sin(Pi / 2));
        System.out.println(customMath.cos(Pi));
        System.out.println(customMath.tan(Pi / 4));
        System.out.println(customMath.cot(Pi / 4));
    }

    @Override
    public double pi(int n) {
        double pi = 0.0;
        boolean positive = true;

        for (int i = 0; i < n; i++) {
            if (positive) {
                pi += 4.0 / (2 * i + 1);
            } else {
                pi -= 4.0 / (2 * i + 1);
            }
            positive = !positive;
        }

        return pi;
    }

    @Override
    public double exp(int n) {
        double x = 1;
        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        return sum;
    }

    @Override
    public double factorial(int n) {
        double x = 1;
        double sum = 1.0;
        for (int i = 1; i <= n; i++) {
            sum *= x;
            x *= i;
        }
        return sum;
    }

    @Override
    public double power(double x, double y) {
        if (y == 0) {
            return 1;
        } else {
            return x * power(x, y - 1);
        }
    }

    @Override
    public double sqrt(double x) {
        double tolerance = 1e-10;
        double guess = x / 2.0;
        while (Math.abs(guess * guess - x) > tolerance) {
            guess = 0.5 * (guess + x / guess);
        }
        return guess;
    }

    @Override
    public double sin(double x) {
        double term = x;
        double sum = 0.0;
        int sign = 1;
        for (int i = 1; i <= 15; i += 2) {
            sum += sign * term;
            term *= x * x / ((i + 1) * (i + 2));
            sign *= -1;
        }
        return sum;
    }

    @Override
    public double cos(double x) {
        double term = 1;
        double sum = 0.0;
        int sign = 1;
        for (int i = 0; i <= 14; i += 2) {
            sum += sign * term;
            term *= x * x / ((i + 1) * (i + 2));
            sign *= -1;
        }
        return sum;
    }

    @Override
    public double tan(double x) {
        return sin(x) / cos(x);
    }

    @Override
    public double cot(double x) {
        return 1 / tan(x);
    }
}
