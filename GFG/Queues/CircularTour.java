package GFG.Queues;

import java.util.*;

public class CircularTour {
    static class PetrolPump {
        int petrol;
        int distance;

        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    static int tour(PetrolPump[] petrolPumps) {
        int n = petrolPumps.length;
        int start = 0; // Starting index of the tour
        int end = 0; // Ending index of the tour
        int petrolBalance = 0;

        Queue<Integer> tourQueue = new LinkedList<>();

        while (start < n) {
            petrolBalance += petrolPumps[start].petrol - petrolPumps[start].distance;

            // If the petrol balance becomes negative, we can't start from the current
            // station
            if (petrolBalance < 0) {
                // Reset the tourQueue and move the starting station to the next one
                while (!tourQueue.isEmpty()) {
                    int removedIndex = tourQueue.poll();
                    petrolBalance -= petrolPumps[removedIndex].petrol - petrolPumps[removedIndex].distance;
                }
                start++;
                end = start;
                petrolBalance = 0;
            } else {
                tourQueue.offer(start);
                end = (end + 1) % n;
                start++;
            }
        }
        System.out.println(tourQueue.peek());
        return tourQueue.poll();
    }

    public static void main(String[] args) {
        // int[] Petrol = { 4, 6, 7, 4 },
        // Distance = { 6, 5, 3, 5 };
        PetrolPump[] petrolPumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };
        tour(petrolPumps);

    }
}
