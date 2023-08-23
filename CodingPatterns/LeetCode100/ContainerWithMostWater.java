package LeetCode100;

public class ContainerWithMostWater {
    
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Max Area: " + maxArea(heights));
    }

    private static int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;

        int maxArea = 0;

        while(left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);

            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
