package StringsQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Compressor {
    
    public static void main(String[] args) {
        
        String str = "AABBACBBBCCCDDDDEEEE";


        System.out.println("The compressor version of this is: ");
		System.out.println(comp(str));

		System.out.println("The compressor version of this is: ");
		comp2(str);
    }

    private static String comp(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= n; i++) {

            if (i == n || str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();   
    }

    private static void comp2(String str) {

        int n = str.length();
        if(n == 0 || str == null) {
            return;
        }

        Map<Character, Integer> hmaps = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(!hmaps.containsKey(str.charAt(i))) {
				hmaps.put(str.charAt(i), 1);
			}
			else {
				hmaps.put(str.charAt(i), hmaps.get(str.charAt(i)) + 1);
			}
		}
		for(Entry<Character, Integer> entry : hmaps.entrySet()) {
			if(entry.getValue() == 1 ) {
				System.out.print(String.valueOf(entry.getKey()));
				continue;
			}
			System.out.print(String.valueOf(entry.getKey()) + String.valueOf(entry.getValue()));
		}
        System.out.println();
    }
}
