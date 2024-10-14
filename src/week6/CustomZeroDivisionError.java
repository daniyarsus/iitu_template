package week6;

public class CustomZeroDivisionError extends RuntimeException {
    public CustomZeroDivisionError(String message) {
        super(message);
    }
}
