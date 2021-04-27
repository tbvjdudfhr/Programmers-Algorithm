package stackqueue.stockprice

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val prices = intArrayOf(1,2,3,2,3)
        var result = intArrayOf(4,3,1,1,0)

        assertEquals(result, Solution().solution(prices))
    }
}