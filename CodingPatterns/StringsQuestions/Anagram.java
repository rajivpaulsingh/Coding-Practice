package StringsQuestions;

public class Anagram {

    public static void main(String[] args) {

        String a = "ABCAD";
		String b = "CDBAA";

        System.out.println("Are these strings anagram? " + isAnagram(a, b));
    }

    private static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()) {
            return false;
        } 

        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        int count[] = new int[26];

        for(int i = 0; i < arrA.length; i++) {
            count[arrA[i] - 97]++;
            count[arrB[i] - 97]--;
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

//     if (str1.length() != str2.length()) {  
//         System.out.println(str1 + " and " +str2 + " not anagrams string");  
//  }else{
//          char[] anagram1 = str1.toCharArray();  
//           char[] anagram2 = str2.toCharArray(); 
//           Arrays.sort(anagram1);  
//           Arrays.sort(anagram2);
//            anagrmstat = Arrays.equals(anagram1, anagram2); 
//  }
//  if (anagrmstat == true) {
//       System.out.println(str1 + " and " +str2 + " anagrams string");  
//  }else{
//      System.out.println(str1 + " and " +str2 + " not anagrams string");  
//          }
//  }
    
}
