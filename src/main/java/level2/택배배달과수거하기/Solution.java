package level2.택배배달과수거하기;

import java.util.ArrayDeque;

public class Solution {
    ArrayDeque<Integer> deliveriesDeque, pickupsDeque;

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;

        deliveriesDeque = ArrayToDeque(deliveries);
        pickupsDeque = ArrayToDeque(pickups);
        addZeroBeforeDeque();

        int index = 0;
        while (!deliveriesDeque.isEmpty()) {
            int toDeliver = deliveriesDeque.removeLast();
            int toPickup = pickupsDeque.removeLast();
            if (index % cap == 0) {
                answer += Math.max(toDeliver, toPickup) * 2;
            }
            index++;
        }

        return answer;
    }

    public ArrayDeque<Integer> ArrayToDeque(int[] array) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                deque.offerLast(i + 1);
            }
        }
        return deque;
    }

    public void addZeroBeforeDeque() {
        int sizeOfDeliveries = deliveriesDeque.size();
        int sizeOfPickups = pickupsDeque.size();
        int difference = Math.abs(sizeOfPickups - sizeOfDeliveries);
        for (int i = 0; i < difference; i++) {
            (sizeOfDeliveries < sizeOfPickups ? deliveriesDeque : pickupsDeque).offerFirst(0);
        }
    }
}
