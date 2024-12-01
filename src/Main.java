import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;  // Импорт ArrayList

public class Main {
    public static void main(String[] args) {
        // Пример для массива байт
        byte[] byteArray = {1, 3, 5, 7, 9};
        byte byteKey = 5;
        int byteIndex = MyArrays.binarySearch(byteArray, byteKey);  // Используем ваш класс
        System.out.println("Индекс " + byteKey + " в массиве байт: " + byteIndex);

        // Пример для массива символов
        char[] charArray = {'a', 'c', 'e', 'g', 'i'};
        char charKey = 'e';
        int charIndex = MyArrays.binarySearch(charArray, charKey);  // Используем ваш класс
        System.out.println("Индекс " + charKey + " в массиве символов: " + charIndex);

        // Пример для массива целых чисел
        int[] intArray = {1, 4, 6, 8, 10};
        int intKey = 6;
        int intIndex = MyArrays.binarySearch(intArray, intKey);  // Используем ваш класс
        System.out.println("Индекс " + intKey + " в массиве целых чисел: " + intIndex);

        // Пример для массива длинных чисел
        long[] longArray = {10L, 20L, 30L, 40L, 50L};
        long longKey = 30L;
        int longIndex = MyArrays.binarySearch(longArray, longKey);  // Используем ваш класс
        System.out.println("Индекс " + longKey + " в массиве длинных чисел: " + longIndex);

        // Пример для массива объектов с использованием Comparator
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        String stringKey = "cherry";
        int stringIndex = MyArrays.binarySearch(stringArray, stringKey, String::compareTo);  // Используем ваш класс
        System.out.println("Индекс " + stringKey + " в массиве строк: " + stringIndex);

        // Пример для списка (с преобразованием примитивного массива в список)
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));  // Используем ArrayList
        int listKey = 7;
        int listIndex = Collections.binarySearch(intList, listKey);
        System.out.println("Индекс " + listKey + " в списке: " + listIndex);

        // Пример для списка объектов с использованием Comparator
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));  // Используем ArrayList
        String stringKeyList = "banana";
        int listIndexWithComparator = Collections.binarySearch(stringList, stringKeyList, String::compareTo);
        System.out.println("Индекс " + stringKeyList + " в списке строк: " + listIndexWithComparator);
    }
}

