package LeetCode100;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(8);

        System.out.println("Before sorting: " + numbers);

        System.out.println("After sorting: " + sortList(numbers));
    }

    public static List<Integer> sortList(List<Integer> list) {
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list);
        List<Integer> sortedList = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            sortedList.add(priorityQueue.poll());
        }

        return sortedList;
    }
}
