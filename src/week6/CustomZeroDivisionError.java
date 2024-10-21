package week6;

public class CustomZeroDivisionError extends Exception {
    public CustomZeroDivisionError(String message) {
        super(message);
    }
}

class Example {
    double a;
    double b;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double catchError() {
        try {
            if (b == 0) {
                throw new CustomZeroDivisionError("Нельзя делить на 0!");
            }
            return a / b;
        } catch (CustomZeroDivisionError e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Example example = new Example(10, 0); // Деление на 0
        System.out.println("Результат: " + example.catchError());
    }
}
