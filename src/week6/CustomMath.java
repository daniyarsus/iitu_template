package week6;

public class CustomMath implements ICustomMath {
    public static void main(String[] args) {
        CustomMath customMath = new CustomMath();
        System.out.println("5^2 = " + customMath.power(5, 2));
        System.out.println("Pi approximation with 1000 terms: " + customMath.pi(1000));
        System.out.println("exp(1) approximation with 10 terms: " + customMath.exp(10));
        System.out.println("Factorial of 5: " + customMath.factorial(5));
        System.out.println("Square root of 25: " + customMath.sqrt(25));
        System.out.println("sin(π/2): " + customMath.sin(Math.PI / 2));
        System.out.println("cos(π): " + customMath.cos(Math.PI));
        System.out.println("tan(π/4): " + customMath.tan(Math.PI / 4));
        System.out.println("cot(π/4): " + customMath.cot(Math.PI / 4));
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
        if (n == 0) return 1;
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    @Override
    public double power(double x, double y) {
        double result = 1;

        if (y > 0) {
            for (int i = 0; i < y; i++) {
                result *= x;
            }
        } else if (y < 0) {
            for (int i = 0; i < -y; i++) {
                result *= x;
            }
            result = 1 / result;
        }

        return result;
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