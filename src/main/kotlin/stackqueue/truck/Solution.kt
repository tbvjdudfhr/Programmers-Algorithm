package stackqueue.truck

import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0;
        val bridgeQueue = LinkedList<Int>();
        var sum = 0;

        for (truck_weight in truck_weights) { //트럭의 개수만큼 반복
            while (true) {
                if (bridgeQueue.isEmpty()) { // 다리 위의 트럭이 없을 경우
                    bridgeQueue.addLast(truck_weight); // 다리의 끝에 트럭 추가
                    answer++;
                    sum += truck_weight; // 트럭의 무게 증가
                    break;
                } else if (bridgeQueue.size == bridge_length) { // 다리 위의 트럭의 크기가 다리 무게와 같을 경우
                    sum -= bridgeQueue.peek(); // 총 무게에서 다리의 트럭 무게를 빼고 트럭을 하나 뺀다.
                    bridgeQueue.poll();
                } else {
                    if (sum + truck_weight > weight) { // 무게 합과 트럭의 크기 합이 다리 무게를 초과할 경우
                        bridgeQueue.addLast(0); // 다리 위에 무게가 0인 가상 트럭 추가 (사실상 트럭의 이동)
                        answer++;
                    } else {
                        bridgeQueue.addLast(truck_weight); // 다리 위의 트럭에 대기 중인 트럭을 추가함
                        answer++;
                        sum += truck_weight; // 무게 합에 추가한 트럭 무게 추가
                        break;
                    }
                }
            }
        }

        return answer + bridge_length; // 다리의 무게 추가해서 return
    }

}