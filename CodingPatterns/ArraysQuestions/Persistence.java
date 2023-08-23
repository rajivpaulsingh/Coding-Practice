package ArraysQuestions;

public class Persistence {

    public static void main(String[] args) {
        System.out.println(persistence(39));   // Output: 3
        System.out.println(persistence(999));  // Output: 4
        System.out.println(persistence(4));    // Output: 0
    }
    
    public static int persistence(int num) {
        int count = 0;
        
        while (num >= 10) {
            num = multiplyDigits(num);
            count++;
        }
        
        return count;
    }
    
    public static int multiplyDigits(int num) {
        int result = 1;
        
        while (num > 0) {
            result *= num % 10;
            num /= 10;
        }
        
        return result;
    }
}

