package org.example;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ElementFinder {

    public static <T> T findElement(Collection<T> collection, T elementToFind) {
        Optional<T> result = collection.stream()
                .filter(element -> element.equals(elementToFind))
                .findFirst();

        return result.orElse(null);
    }

    public static void main(String[] args) {
        // Example usage:
        // Creating a list of integers
        Collection<Integer> integerList = List.of(1, 2, 3, 4, 5);

        // Trying to find the element 3 in the list
        Integer result = findElement(integerList, 3);

        // Print the result
        System.out.println("Result: " + result);
    }
}

