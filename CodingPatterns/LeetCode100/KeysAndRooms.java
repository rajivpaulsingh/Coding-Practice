package LeetCode100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class KeysAndRooms {
    
    public static void main(String[] args) {

        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(new ArrayList<>());

        System.out.println("Can visit all rooms? " + canVisitRooms(rooms));
    }

    private static boolean canVisitRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // starts with room 0

        while(!stack.isEmpty()) {
            int curRoom = stack.pop();
            List<Integer> keys = rooms.get(curRoom);

            for(int key : keys) {
                if(!visited[key]) {
                    visited[key] = true;
                    stack.push(key);
                }
            }
        }

        for(boolean roomVisited : visited) {
            if(!roomVisited) {
                return false;
            }
        }

        return true;
    }
}
