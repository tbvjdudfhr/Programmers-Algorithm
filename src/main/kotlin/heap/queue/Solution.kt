package heap.queue

import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val answer = intArrayOf(0,0)
        val minHeap = PriorityQueue<Int>()
        val maxHeap = PriorityQueue<Int>(compareByDescending { it })

        operations.forEach {
            val temp = it.split(" ")
            when (temp[0]) {
                "I" -> {
                    minHeap.add(temp[1].toInt())
                    maxHeap.add(temp[1].toInt())
                }
                "D" -> {
                    when (temp[1]) {
                        "-1" -> {
                            maxHeap.remove(minHeap.poll())
                        }
                        "1" -> {
                            minHeap.remove(maxHeap.poll())
                        }
                    }
                }
            }
        }
        if (maxHeap.isNotEmpty()) {
            return intArrayOf(maxHeap.poll(),minHeap.poll())
        }

        return answer
    }
}