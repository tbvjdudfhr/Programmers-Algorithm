package sort.largestnumber

class Solution {
    fun solution(numbers: IntArray): String {
        val stringArray =
            numbers.map { it.toString() }.toTypedArray().sortedWith { o1, o2 -> (o2 + o1).compareTo(o1 + o2) }
        var answer = ""

        // 0000 = 0
        if (stringArray[0] == "0")
            return "0"

        for (str in stringArray) {
            answer += str
        }

        return answer
    }
}