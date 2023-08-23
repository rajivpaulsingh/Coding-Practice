package LeetCode100;

public class FirstBadVersion {

    public static void main(String[] args) {

        int n = 10;

        System.out.println("The first true version is at index: " + badVersion(n));
    }

    private static int badVersion(int n) {

        int left = 0;
        int right = n;

        while(left <= right) {
            int mid  = left + (right - left) / 2;

            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isBadVersion(int version) {
        int badVersion = 4; // Example bad version

        return version >= badVersion;
    }
    
}
