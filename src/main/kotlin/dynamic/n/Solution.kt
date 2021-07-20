package dynamic.n

import kotlin.math.pow


class Solution {
    var answer = -1
    fun solution(N: Int, number: Int): Int {
        dfs(N, number, 0, 0)
        return answer
    }

    private fun dfs(N: Int, number: Int, count: Int, prev: Int) {
        if (count > 8) {
            answer = -1
            return
        }
        if (number == prev ) {
            if (answer == -1 || answer > count)
                answer = count
            return
        }
        var temp = N
        for (i in 0 until 8 - count) {
            dfs(N,number,count + i + 1, prev + temp)
            dfs(N,number,count + i + 1, prev - temp)
            dfs(N,number,count + i + 1, prev * temp)
            dfs(N,number,count + i + 1, prev / temp)
            temp += temp * 10
        }
    }
}