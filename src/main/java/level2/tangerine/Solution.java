package level2.tangerine;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int size : tangerine) {
            hashMap.put(size, hashMap.getOrDefault(size, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
        entryList.sort(((o1, o2) -> hashMap.get(o2.getKey()) - hashMap.get(o1.getKey())));

        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            sum += entry.getValue();
            answer++;
            if(sum >= k) {
                break;
            }
        }
        return answer;
    }
}
