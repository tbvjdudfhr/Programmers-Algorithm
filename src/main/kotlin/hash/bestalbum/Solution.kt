package hash.bestalbum

class Solution {
    fun solution(genres: Array<String>, plays: Array<Int>): IntArray {
        val hashMap = HashMap<String, Int>()
        val answer: IntArray
        val resultList = ArrayList<Int>()
        for (i in genres.indices) {
            hashMap[genres[i]]?.let {hashMap.put(genres[i], it.plus(plays[i]))} ?: hashMap.put(genres[i], plays[i])
        }
        val sMap = hashMap.toList().sortedByDescending { (_, value) -> value }.toMap()
        for (entry in sMap) {
            val map = HashMap<Int, Int>()
            for (i in genres.indices) {
                if (entry.key == genres[i]) {
                    map[i] = plays[i]
                }
            }
            val sortMap = map.toList().sortedByDescending { (_, value) -> value }.toMap()
            var count = 0;
            for (e in sortMap) {
                count++
                if(count > 2) break
                resultList.add(e.key)
            }
        }
        answer = resultList.toIntArray()
        return answer
    }
}