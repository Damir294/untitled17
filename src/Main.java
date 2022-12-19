import Table.MultiplicationTable;
import Table.Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        numbersSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(5, 3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        System.out.println(set);
    }

    public static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
    }
}