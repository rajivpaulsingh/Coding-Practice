package Misc;

public class IsRotation {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2a = {4, 6, 5, 7, 1, 2, 3};        
        int[] arr2b = {4, 5, 6, 7, 1, 2, 3};
        
        System.out.println("Are array 1 and 2a rotated to each other? " + isRotate(arr1, arr2a));
        System.out.println("Are array 1 and 2b rotated to each other? " + isRotate(arr1, arr2b));
        
    }

    private static boolean isRotate(int[] arr1, int[] arr2) {
        
        int len1 = arr1.length;
        int len2 = arr2.length;

        if(len1 != len2) {
            return false;
        }

        int index = -1;
        for(int i = 0; i < len1; i++) {
            if(arr1[i] == arr2[0]) {
                index = i;
                break;
            }
        }

        for(int i = 0; i < len1; i++) {
            int j = (index + i) % len1;

            if(arr1[j] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
}
