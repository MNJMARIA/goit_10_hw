package task_4;

import java.util.stream.Stream;

public class Main {
    /*Завдання 4
    Використовуючи Stream.iterate, створіть безкінечний стрім
    випадкових чисел, але не використовуючи Math.random().
    Реалізуйте свій лінійний конгруентний генератор.
    Для цього почніть з x[0] = seed, і далі кожний наступний елемент
    рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m
    для коректних значень a, c, та m.
    Необхідно імплементувати метод, що приймає на вхід параметри
    a, c, та m, і повертає Stream<Long>.
    Для тесту використовуйте такі дані:
    a = 25214903917
    c = 11
    m = 2^48 (2в степені48`)*/
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = 2^48L;
        Stream<Long> stream = generate(a, c, m, 10);

            stream
                .limit(15)
                .forEach(System.out::println); //number -> System.out.println(number)

    }
    public static Stream<Long> generate(long a, long c, long m, long seed){
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}
