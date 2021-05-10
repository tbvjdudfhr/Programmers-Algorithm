package dfsbfs.targetnumber

class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers, target, 0, 0)
    }

    private fun dfs(numbers: IntArray, target: Int, depth: Int, num: Int): Int {
        return if (depth == numbers.size) {
            when (num) {
                target -> 1
                else -> 0
            }
        } else {
            return dfs(numbers, target, depth + 1, num + numbers[depth]) + dfs(
                numbers,
                target,
                depth + 1,
                num - numbers[depth]
            )
        }
    }
}