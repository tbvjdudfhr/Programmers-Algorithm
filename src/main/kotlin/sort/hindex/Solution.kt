package sort.hindex

class Solution {
    fun solution(citations: IntArray): Int {
        val answer = citations.size
        citations.sortedArrayDescending()
            .mapIndexed { index, i ->
                if (i <= index)
                    return index
            }
        return answer
    }
}