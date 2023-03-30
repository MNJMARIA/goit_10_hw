package task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Work {

    public List<String> createList()
    {
        List<String> names= new ArrayList<>();
        names.add("Ivan");
        names.add("Dmytro");
        names.add("Peter");
        names.add("Vlad");
        names.add("Alina");
        names.add("Mariya");

        return names;
    }
    public String addNumberToItemInList(List<String> names)
    {
        return IntStream.range(0, names.size())
                .filter(i -> i%2 == 0) // бо беремо індекси( і=0(парне), але елемент під порядковим номером 1)
                .mapToObj(i -> (i+1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
