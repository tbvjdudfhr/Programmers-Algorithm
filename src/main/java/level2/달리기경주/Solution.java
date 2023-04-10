package level2.달리기경주;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Solution {
    HashMap<String, Integer> map;
    public String[] solution(String[] players, String[] callings) {
        map = new HashMap<>();
        IntStream.range(0, players.length).forEach(it -> map.put(players[it], it));

        for (String calling : callings) {
            changePlayer(players, calling);
        }
        return players;
    }

    private void changePlayer(String[] players, String calling) {
        Integer index = map.get(calling);
        map.put(calling, index -1);
        if (index == 0) {
            return;
        }

        String temp = players[index -1];
        map.put(temp, index);
        players[index -1] = players[index];
        players[index] = temp;
    }
}
