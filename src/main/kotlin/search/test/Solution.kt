package search.test

class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val arr2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val arr3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val list = mutableListOf(0, 0, 0)
        for (i in answers.indices) {
            if (answers[i] == arr[i % 5]) list[0]++
            if (answers[i] == arr2[i % 8]) list[1]++
            if (answers[i] == arr3[i % 10]) list[2]++
        }

        val indexList = mutableListOf<Int>()
        list.forEachIndexed { index, i ->
            if (list.maxOrNull() == i) {
                indexList.add(index + 1)
            }
        }
        return indexList.sorted().toIntArray()
    }
}