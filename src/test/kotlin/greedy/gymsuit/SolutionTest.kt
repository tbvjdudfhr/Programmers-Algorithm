package greedy.gymsuit

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val n = 5
        val lost = intArrayOf(2,4)
        val reserve = intArrayOf(1,3,5)
        val result = 5

        val n2 = 5
        val lost2 = intArrayOf(2,4)
        val reserve2 = intArrayOf(3)
        val result2 = 4

        val n3 = 2
        val lost3 = intArrayOf(1)
        val reserve3 = intArrayOf(2)
        val result3 = 2

        val n4 = 3
        val lost4 = intArrayOf(1,2)
        val reserve4 = intArrayOf(2,3)
        val result4 = 2

        assertEquals(result, Solution().solution(n, lost, reserve))
        assertEquals(result2, Solution().solution(n2, lost2, reserve2))
        assertEquals(result3, Solution().solution(n3, lost3, reserve3))
        assertEquals(result4, Solution().solution(n4, lost4, reserve4))
    }
}