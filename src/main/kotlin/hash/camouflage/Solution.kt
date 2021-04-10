package hash.camouflage


class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val hashMap = HashMap<String, Int>()

        for (clo in clothes) {
            hashMap[clo[1]]?.let { hashMap.replace(clo[1], it.plus(1)) } ?: hashMap.put(clo[1], 1)
        }

        // 입을수도 있고 안 입을 수도 있음
       for (v in hashMap.values) {
            answer *= v + 1
        }

        // 하나도 안 입었을 경우의 수를 뺌
        answer--

        return answer
    }
}