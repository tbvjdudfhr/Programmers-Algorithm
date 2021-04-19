package sort.hindex

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution () {
        val citations = intArrayOf(3, 0 ,6, 1, 5)
        val citations2 = intArrayOf(0, 1, 1)
        val result = 3
        val result2 = 1
        assertEquals(result, Solution().solution(citations))
        assertEquals(result2, Solution().solution(citations2))
    }
}