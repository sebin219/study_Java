package lecture.exception.section02.exception;

public class MoneyNegativeException extends Exception{
    public MoneyNegativeException() {
        super("소지한 돈은 음수가 될 수 없습니다.");
    }

    public MoneyNegativeException(String message) {
        super(message);
    }
}
