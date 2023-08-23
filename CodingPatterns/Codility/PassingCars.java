package Codility;

// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
public class PassingCars {

    public static void main(String[] args) { 

        int[] arr = {0, 1, 0, 1, 1};

        System.out.println("Number of passing cars are: " + cars(arr));
    }
    
    private static int cars(int[] arr) {
        
        int n = arr.length;

        int num_east = 0;
        int num_pass = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                num_east++;
            }
            if(arr[i] == 1) {
                num_pass = num_pass + num_east;
            }
        }

        if(num_pass > 1000000000 || num_pass < 0) {
            return -1;
        }

        return num_pass;
    }
}
