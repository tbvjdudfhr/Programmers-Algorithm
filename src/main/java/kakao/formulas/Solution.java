package kakao.formulas;

import java.util.ArrayList;

class Solution {
    static char[] top = {'-', '*', '+'};
    long answer;

    public long solution(String expression) {
        ArrayList<Long> longs = new ArrayList();
        ArrayList<Character> characters = new ArrayList();
        String num = "";
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                num += expression.charAt(i);
            } else {
                longs.add(Long.parseLong(num));
                num = "";
                characters.add(expression.charAt(i));
            }
        }
        longs.add(Long.parseLong(num));
        perm(longs, characters, 0);
        return answer;
    }

    public long Calculate(ArrayList<Long> longs, ArrayList<Character> characters) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < characters.size(); j++) {
                if (characters.get(j) == top[i]) {
                    switch (top[i]) {
                        case '-':
                            longs.add(j, longs.remove(j) - longs.remove(j));
                            break;
                        case '*':
                            longs.add(j, longs.remove(j) * longs.remove(j));
                            break;
                        case '+':
                            longs.add(j, longs.remove(j) + longs.remove(j));
                            break;
                    }
                    characters.remove(j--);
                }
            }
        }
        return Math.abs(longs.get(0));
    }

    public void perm(ArrayList<Long> longs, ArrayList<Character> characters, int depth) {
        if (depth == 3) {
            long temp = Calculate((ArrayList<Long>) longs.clone(), (ArrayList<Character>) characters.clone());
            if (temp > answer)
                answer = temp;
            return;
        }
        for (int i = depth; i < 3; i++) {
            swap(i, depth);
            perm(longs, characters, depth + 1);
            swap(i, depth);
        }
    }

    public void swap(int a, int b) {
        char k = top[a];
        top[a] = top[b];
        top[b] = k;
    }
}
