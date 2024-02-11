package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ElementFinder {

    public static <T> Object findElement(Collection<T> collection, T elementToFind) {
        Optional<T> result = collection.stream()
                .filter(element -> element.equals(elementToFind))
                .findFirst();
        return result.isPresent() ? result.get() : -1;
    }

    public static void main(String[] args) {
        // Örnek kullanım
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer element = 3;
        Integer notFoundElement = 10;

        System.out.println("Bulunan öğe: " + findElement(numbers, element));
        System.out.println("Bulunamayan öğe: " + findElement(numbers, notFoundElement));
    }
}
