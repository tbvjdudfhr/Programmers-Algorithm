package greedy.gymsuit

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size
        val reserveSet = reserve.sortedArray().map { it }.toMutableSet()

        lost.forEachIndexed { index, i ->
            if (reserveSet.contains(i)) {
                reserveSet.remove(i)
                answer++
                lost[index] = -1
            }
        }

        for (it in lost.sortedArray()) {
            if (reserveSet.contains(it - 1)) {
                answer++
                reserveSet.remove(it - 1)
            } else if (reserveSet.contains(it + 1)) {
                reserveSet.remove(it + 1)
                answer++
            }
        }
        return answer
    }
}