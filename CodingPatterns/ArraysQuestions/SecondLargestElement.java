package ArraysQuestions;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 15, 1};

        System.out.println("The second largest element is: " + secondLargest(arr));
        System.out.println("The second largest element is: " + secondLargest1(arr));
    }

    private static int secondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    private static int secondLargest1(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != largest) {
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        return secondLargest;
    }
}