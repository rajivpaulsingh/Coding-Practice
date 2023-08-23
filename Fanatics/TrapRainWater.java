package Fanatics;

public class TrapRainWater {

    public static void main(String[] args) {
        
        int[] height = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};

        System.out.println("Amount of trapped water: " + trap(height));
    }

    private static int trap(int[] heights) {

        int n = heights.length;
        int[] leftMax = new int[n];
        int[] rightmax = new int[n];

        leftMax[0] = heights[0];
        rightmax[n - 1] = heights[n - 1];

        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }
        for(int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], heights[i]);
        }

        int water = 0;
        for(int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightmax[i]) - heights[i];
        }

        return water;
    }
    
}
