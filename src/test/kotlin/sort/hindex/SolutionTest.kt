package sort.hindex

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution () {
        val citations = intArrayOf(3, 0 ,6, 1, 5)
        val result = 3
        assertEquals(result, Solution().solution(citations))
    }
}