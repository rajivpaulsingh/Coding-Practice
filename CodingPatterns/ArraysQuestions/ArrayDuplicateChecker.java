package ArraysQuestions;

import java.util.Arrays;

public class ArrayDuplicateChecker {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Has duplicate: " + hasDuplicate(numbers));

        int[] numbersWithDuplicate = {1, 2, 3, 4, 4, 5};
        System.out.println("Has duplicate: " + hasDuplicate(numbersWithDuplicate));
    }

    private static boolean hasDuplicate(int[] arr) {

        int[] distinctArr = Arrays.stream(arr).distinct().toArray();
        
        return distinctArr.length != arr.length;
    }
}
