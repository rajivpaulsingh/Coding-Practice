package LeetCode100;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIslandAndSizes {
    public static void main(String args[]) {

        char[][] grid = {
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'}
        };

        List<Integer> islandSizes = numIslands(grid);
        System.out.println("Number of islands: " + islandSizes.size());
        System.out.println("Size of each island: " + islandSizes);
    }

    private static List<Integer> numIslands(char[][] grid) {
        List<Integer> islandSizes = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    int size = helper(grid, i, j);
                    islandSizes.add(size);
                }
            }
        }

        return islandSizes;
    }

    private static int helper(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return 0;
        }

        grid[i][j] = '0';
        int size = 1;

        size += helper(grid, i + 1, j);
        size += helper(grid, i - 1, j);
        size += helper(grid, i, j + 1);
        size += helper(grid, i, j - 1);

        return size;
    }
}

