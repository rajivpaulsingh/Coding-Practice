package LeetCode100;

public class NoOfProvinces {
    
    public static void main(String[] args) {
        
        int[][] cities = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };

        System.out.println("Total provinces are: " + numProvince(cities));
    }

    private static int numProvince(int[][] cities) {

        int[] visited = new int[cities.length];
        int res = 0;

        for(int i = 0; i < cities.length; i++) {
            if(visited[i] == 0) {
                helper(cities, visited, i);
                res++;
            }
        }
        return res;
    }

    private static void helper(int[][] cities, int[] visited, int i) {

        for(int j = 0; j < cities.length; j++) {
            if(cities[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                helper(cities, visited, j);
            }
        }
    }
}
