package binarysearch.immigration

import java.util.*


class Solution {
    fun solution(n: Int, times: IntArray): Long {
        // 모든 사람이 심사를 받는데 걸리는 시간의 최솟값
        // 모든 사람이 심사를 받는데 걸리는 시간의 최솟값
        var answer = Long.MAX_VALUE

        Arrays.sort(times)

        var start: Long
        var mid: Long
        var end: Long
        start = 0
        end = Long.MAX_VALUE
        var sum: Long
        // 모든 사람이 심사 받는데 걸리는 시간 이분 탐색
        // mid : 심사를 받는데 주어진 시간
        // sum : 주어진 시간(mid)동안 심사를 받을 수 있는 사람 수
        // 모든 사람이 심사 받는데 걸리는 시간 이분 탐색
        // mid : 심사를 받는데 주어진 시간
        // sum : 주어진 시간(mid)동안 심사를 받을 수 있는 사람 수
        while (start <= end) {
            mid = (start + end) / 2
            sum = 0
            // 주어진 시간동안 몇명 검사 할 수 있는지 누적합
            for (element in times) {
                sum += mid / element
                if (sum >= n) break
            }

            // 비교 대상(사람 수)
            // 검사 다 못할 때(시간 부족)
            if (n > sum) {
                start = mid + 1
            } else {
                end = mid - 1
                answer = Math.min(answer, mid)
            }
        }

        return answer
    }
}