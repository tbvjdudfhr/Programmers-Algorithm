package kakao.bracket;

import java.util.Stack;

class Solution {
    int pos;

    public String solution(String p) {
        if (p.isEmpty()) {
            return p;
        }

        boolean correct = isCorrect(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos);

        if (correct) {
            return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";
        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') {
                answer += ")";
            } else {
                answer += "(";
            }
        }

        return answer;
    }

    public boolean isCorrect(String p) {
        Stack<Character> st = new Stack<>();
        boolean right = true;
        int l = 0;
        int r = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                l++;
                st.push('(');
            } else {
                r++;
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    right = false;
                }
            }
            if (l == r) {
                pos = i + 1;
                return right;
            }
        }

        return right;
    }
}
