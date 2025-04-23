package lecture.exception.section02.exception;

public class PriceNegativeException extends Exception{
    public PriceNegativeException() {
        super("가격은 음수가 될 수 없습니다.");
    }

    public PriceNegativeException(String message) {
        super(message);
    }
}
