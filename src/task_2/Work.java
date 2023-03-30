package task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Work {
    public List<String> createdList = createList();
    private List<String> createList()
    {
        List<String> names= new ArrayList<>();
        names.add("Ivan");
        names.add("Dmytro");
        names.add("Peter");
        names.add("Vlad");
        names.add("Angel");
        names.add("Mariya");
        names.add("Bell");

        return names;
    }
    public void reverseSortList(List<String> names)
    {
        Stream<String> streamOfNames = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder()); // (o1,o2) -> o2.compareTo(o1)
        List<String> result = streamOfNames.collect(Collectors.toList());
        System.out.println(result);
    }
}
