package task_3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
   /*Завдання 3
    Є масив: ["1, 2, 0", "4, 5"]
    Необхідно отримати з масиву всі числа, і вивести їх
    у відсортованому вигляді через кому , наприклад: "0, 1, 2, 4, 5"*/
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(numbers)
                .flatMap(line -> Arrays.stream(line.split(", "))) //злиття всіх масивів чисел в один великий потік рядків.
                .map(Integer::parseInt) // line -> Integer.parseInt(line) перетворення рядків на цілі числа.
                .sorted(Integer::compareTo) //(o1,o2) -> o1.compareTo(o2)
                .map(Object::toString) //number -> number.toString() перетворення чисел на рядки.
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    /*як варіант:
    public String sortNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));
    }*/
}
