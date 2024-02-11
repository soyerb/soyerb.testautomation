package org.example;
import java.util.Arrays;
import java.util.List;

public class GenericField<T> {
    private final List<T> field;

    public GenericField(List<T> field) {
        this.field = field;
    }

    public void printField() {
        System.out.println("Field: " + Arrays.toString(field.toArray()));
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        GenericField<String> printer = new GenericField<>(names);
        printer.printField();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        GenericField<Integer> numbersPrinter = new GenericField<>(numbers);
        numbersPrinter.printField();
    }
}