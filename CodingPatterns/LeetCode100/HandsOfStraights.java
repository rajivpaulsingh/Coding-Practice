package LeetCode100;

import java.util.*;

public class HandsOfStraights {

    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }

        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            int firstCard = countMap.firstKey();
            for (int i = firstCard; i < firstCard + W; i++) {
                if (!countMap.containsKey(i)) {
                    return false;
                }
                int count = countMap.get(i);
                if (count == 1) {
                    countMap.remove(i);
                } else {
                    countMap.put(i, count - 1);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] hand = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int W = 3;

        HandsOfStraights solution = new HandsOfStraights();
        boolean isNStraightHand = solution.isNStraightHand(hand, W);

        System.out.println("Is a valid hand of straights? " + isNStraightHand);
    }
}
