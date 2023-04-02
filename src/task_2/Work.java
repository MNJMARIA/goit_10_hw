package task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
    public List<String> reverseSortList(List<String> names)
    {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
