package task_2;

public class Main {
  /*Завдання 2
    Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
    Повертає список цих рядків у верхньому регістрі,
    і відсортованих за спаданням (від Z до A).*/
    public static void main(String[] args) {
      Work work = new Work();
      System.out.println(work.reverseSortList(work.createdList));
    }
}
