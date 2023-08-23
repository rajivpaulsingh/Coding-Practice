package StringsQuestions;

public class ConsecutiveRepeatedCharacter {

    public static void main(String[] args) {

        String str = "aaaaaaaabbaacccccccccccccbbbbbbbbbbbbdddddddeeeeebffffffffffffffff";
    
        System.out.println("The letter repeated most times consecutively is: " + repeatedLetter(str));
    }

    private static Character repeatedLetter(String str) {

        int n = str.length();
        int res = 0;
        int count = 1;
        char maxChar = '\0';

        for(int i = 0; i < n - 1; i++) {

            if(str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if(count > res) {
                    res = count;
                    maxChar = str.charAt(i);                   
                }
                count = 1; //reset
            }
        }

        // check if last character count is the longest
        if(count > res) {
            res = count;
            maxChar = str.charAt(n - 1);
        }

        return maxChar;
    }
    
}
