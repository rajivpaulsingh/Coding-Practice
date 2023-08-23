package LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        
        int n = 5;

        System.out.println("The pascal triangle is: ");
        System.out.println(pascal(n));
        System.out.println(pascal1(n));
    }

    private static List<List<Integer>> pascal(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for(int i = 1; i < numRows; i++) {

            List<Integer> prevRow = res.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            for(int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currRow.add(1);
            res.add(currRow);
        }

        return res;
    }

    private static List<List<Integer>> pascal1(int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            cur.add(0, 1);

            for(int j = 1; j < cur.size() - 1; j++) {
                cur.set(j, cur.get(j) + cur.get(j + 1));
            }
            res.add(new ArrayList<>(cur));
        }
        return res;
    }
    
}
