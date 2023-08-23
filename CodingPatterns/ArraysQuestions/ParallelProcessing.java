package ArraysQuestions;

import java.util.Arrays;

public class ParallelProcessing {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(arr)
                .parallel()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
    
}
