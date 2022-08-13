package cafe.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.IntStream;

class Solution {
    private static HashSet<String> stringHashSet = new HashSet<>();

    public String[] solution(String[] args) {
        String[] answer;
        ArrayList<Word> words = new ArrayList<>();
        for (String arg : args) {
            if(isNotDuplicate(arg)) {
                words.add(new Word(arg, arg.length()));
            }
        }

        Collections.sort(words);
        answer = new String[words.size()];
        int bound = words.size();
        for (int i = 0; i < bound; i++) {
            answer[i] = words.get(i).name;
        }
        return answer;
    }

    private boolean isNotDuplicate(String arg) {
        if(stringHashSet.contains(arg)) {
            return false;
        }
        stringHashSet.add(arg);
        return true;
    }

    private class Word implements Comparable<Word> {
        private String name;
        private int length;

        public Word(String name, int length) {
            this.name = name;
            this.length = length;
        }

        @Override
        public int compareTo(Word o) {
            if(this.length == o.length) {
                return o.name.compareTo(this.name);
            }
            return this.length - o.length;
        }
    }
}