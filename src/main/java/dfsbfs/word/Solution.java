package dfsbfs.word;

class Solution {
    static boolean[] visited;
    static int answer = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        if(!isConvert(target, words)) {
            return 0;
        }
        dfs(begin, target, words, 0);
        return answer;
    }

    private boolean isConvert(String target, String[] words) {
        for (String word : words) {
            if(word.equals(target)) return true;
        }
        return false;
    }

    public static void dfs(String begin, String target, String[] words, int cnt) {
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            if (getSameCount(begin, words[i]) == begin.length() - 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }

    private static int getSameCount(String begin, String target) {
        int cnt = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) == target.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
