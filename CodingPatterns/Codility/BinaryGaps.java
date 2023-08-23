package Codility;

// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
public class BinaryGaps {

    public static void main(String[] args) {

        int N1 = 529; // 1000010001
        int N2 = 1041; // 10000010001
        int N3 = 9; // 1001
        int N4 = 32; // 100000

        System.out.println("Binary gap is: " + binarGap(N1));
        System.out.println("Binary gap is: " + binarGap(N2));
        System.out.println("Binary gap is: " + binarGap(N3));
        System.out.println("Binary gap is: " + binarGap(N4));
    }

    private static int binarGap(int N) {

        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        boolean countingGap = false;

        for(int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);

            if(c == '1') {
                if(countingGap) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                } else {
                    countingGap = true;
                }
            } else if(c == '0') {
                currentGap++;
            }
        }
        return maxGap;
    }
    
}

