package task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /*Завдання 5
    Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
     який "перемішує" елементи зі стрімів first та second,
     зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.*/

    public static void main(String[] args) {
        Stream<String> first = Stream.of("Bell", "Riuu", "Mariya", "Alize");
        Stream<String> second = Stream.of("Cranel", "Lion", "Kim");

        Stream<String> result = zip(first, second);
        //Expect - Bell Cranel Riuu Lion Mariya Kim

        System.out.println("RESULT: ");
        result.forEach(element -> System.out.print(element + " "));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        List<T> resultList = new ArrayList<>();
        for(int i = 0; i < minSize; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }
        return resultList.stream();
    }
    /*як варіант:
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIter = first.iterator();
        Iterator<T> secondIter = second.iterator();
        Stream.Builder<T> builder = Stream.builder();
        while (firstIter.hasNext() && secondIter.hasNext()) {
            builder.add(firstIter.next());
            builder.add(secondIter.next());}
        return builder.build();
    }*/
}
