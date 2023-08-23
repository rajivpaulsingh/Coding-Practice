package ArraysQuestions;

import java.util.Arrays;

public class ParallelExecution {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry", "strawberry"};

        // Sequential execution
        System.out.println("Sequential execution");
        Arrays.stream(words)
                .forEach(System.out::println);

        // Parallel execution
        System.out.println("Parallel execution");
        Arrays.stream(words)
                .parallel()
                .forEach(System.out::println);
    }
    
}
