import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int i = 0, day = 1, attended = 0;
        while (i < events.length || !minHeap.isEmpty()) {
            // Add all events starting today
            while (i < events.length && events[i][0] == day) {
                minHeap.offer(events[i][1]); // Add end day
                i++;
            }

            // Remove events that already ended
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend the event that ends earliest
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                attended++;
            }

            day++;
        }

        return attended;
    }
}