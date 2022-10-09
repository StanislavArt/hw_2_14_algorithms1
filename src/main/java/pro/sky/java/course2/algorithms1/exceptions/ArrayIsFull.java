package pro.sky.java.course2.algorithms1.exceptions;

public class ArrayIsFull extends RuntimeException {
    public ArrayIsFull() {
        super("Массив заполнен");
    }
}
