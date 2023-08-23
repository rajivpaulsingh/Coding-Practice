package LeetCode100;

public class LicenseKeyFormatting {
    
    public static void main(String[] args) {
        
        String str = "2-4A0r7-4k";
        int K = 3;

        System.out.println("Formatted License Key: " + formatLicenseKey(str, K));
    }

    private static String formatLicenseKey(String str, int K) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);

            if(c == '-') continue;

            if(count == K) {
                sb.append('-');
                count = 0;
            }

            sb.append(c);
            count++;
        }

        return sb.reverse().toString().toUpperCase();
    }
}
