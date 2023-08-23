package Fanatics;

import java.util.LinkedList;
import java.util.Queue;

public class TrainStation {
    
    public static void main(String[] args) {
        
        Queue<String> trains = new LinkedList<>();

        arrive(trains, "Train A");
        arrive(trains, "Train B");
        arrive(trains, "Train C");

        System.out.println("Current train queue: " + trains);

        depart(trains);
        depart(trains);

        System.out.println("Current train queue: " + trains);
    }

    private static void arrive(Queue<String> trains, String name) {

        trains.add(name);
        System.out.println(name + " has arrived at the station");
    }

    private static void depart(Queue<String> trains) {

        if(!trains.isEmpty()) {
            String departedName = trains.poll();
            System.out.println(departedName + " has departed the station");
        } else {
            System.out.println("No trains in the station");
        }
    }
}
