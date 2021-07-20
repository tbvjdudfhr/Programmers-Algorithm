package search.test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val answers = intArrayOf(1,2,3,4,5)
        val result = intArrayOf(1)
        val answers2 = intArrayOf(1,3,2,4,2)
        val result2 = intArrayOf(1,2,3)
        //assertEquals(result, Solution().solution(answers))
        assertEquals(result2, Solution().solution(answers2))
    }
}