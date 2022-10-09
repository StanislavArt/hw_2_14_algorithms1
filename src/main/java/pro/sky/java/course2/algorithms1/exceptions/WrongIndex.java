package pro.sky.java.course2.algorithms1.exceptions;

public class WrongIndex extends RuntimeException {
    public WrongIndex() {
        super("Указан неверный индекс");
    }
}
