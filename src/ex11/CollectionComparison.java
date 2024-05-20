package ex11;

import java.util.*;

public class CollectionComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();

        int numElements = 100000;
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListTime = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(0, i);
        }
        endTime = System.nanoTime();
        long arrayListAddToFrontTime = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        long arrayListAddToEndTime = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListTime = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        long linkedListAddToFrontTime = (endTime - startTime) / 1000000;
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddToEndTime = (endTime - startTime) / 1000000; // Перевод в миллисекунды
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long hashSetTime = (endTime - startTime) / 1000000; // Перевод в миллисекунды
        System.out.println("Время добавления элементов в ArrayList: " + arrayListTime + " мс");
        System.out.println("Время добавления элементов в начало ArrayList: " + arrayListAddToFrontTime + " мс");
        System.out.println("Время добавления элементов в конец ArrayList: " + arrayListAddToEndTime + " мс");
        System.out.println("Время добавления элементов в LinkedList: " + linkedListTime + " мс");
        System.out.println("Время добавления элементов в начало LinkedList: " + linkedListAddToFrontTime + " мс");
        System.out.println("Время добавления элементов в конец LinkedList: " + linkedListAddToEndTime + " мс");
        System.out.println("Время добавления элементов в HashSet: " + hashSetTime + " мс");
    }
}

