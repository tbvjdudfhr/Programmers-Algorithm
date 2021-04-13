package sort.kthnumber

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = Array(commands.size) { i -> i }
        for ((index, intArray) in commands.withIndex()) {
            answer[index] = array.filterIndexed { index2, i ->
                index2 >= intArray[0] - 1 && index2 <= intArray[1] - 1
            }.sortedBy { it }[intArray[2] - 1]
        }
        return answer.toIntArray()
    }
}