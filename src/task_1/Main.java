package task_1;

public class Main {
    /*Завдання 1
   Метод приймає на вхід список імен.
   Необхідно повернути рядок вигляду 1. Ivan, 3. Peter...
   лише з тими іменами, що стоять під непарним індексом
   (1, 3 тощо)*/
    public static void main(String[] args) {
        Work work = new Work();
        String result = work.addNumberToItemInList(work.createList());
        System.out.println(result);
    }

}
