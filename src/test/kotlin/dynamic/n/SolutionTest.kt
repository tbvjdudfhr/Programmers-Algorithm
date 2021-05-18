package dynamic.n

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val n = 5
        val n2 = 2
        val number = 12
        val number2 = 11
        val result = 4
        val result2 = 3

        assertEquals(result, Solution().solution(n, number))
        assertEquals(result2, Solution().solution(n2, number2))
    }
}