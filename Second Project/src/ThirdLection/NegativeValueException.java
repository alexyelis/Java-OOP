package ThirdLection;

public class NegativeValueException extends Exception {
    @Override
    public String getMessage() {
        return "You input negative value";
    }
}
