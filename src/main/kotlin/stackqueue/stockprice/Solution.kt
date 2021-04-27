package stackqueue.stockprice

class Solution {
    fun solution(prices: IntArray): IntArray {
        val answer = IntArray(prices.size)
        var time = 0

        for (i in prices.indices) {
            for (j in i + 1 until prices.size) {
                time++
                if (prices[i] > prices[j]) {
                    break
                }
            }
            answer[i] = time
            time = 0
        }
        return answer
    }
}