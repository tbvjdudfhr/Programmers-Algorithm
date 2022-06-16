package kakao.game;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        String[] score = dartResult.split("\\D+");
        String[] pow = dartResult.split("\\d+");
        List<Step> stages = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Step s = new Step();
            s.setScore(score[i]);
            s.setPow(pow[i + 1].charAt(0));
            if (pow[i + 1].length() == 2) {
                if (pow[i + 1].charAt(1) == '*') {
                    s.setEvent("2");
                    if (i != 0) {
                        stages.get(i - 1).setEvent("2");
                    }
                } else {
                    s.setEvent("-1");
                }

            }
            stages.add(s);

        }
        return stages.stream()
                .mapToInt(op -> (int) op.getResult())
                .sum();
    }

    class Step {
        private int score;
        private int pow;
        private int event;

        public Step() {
            event = 1;
        }

        public void setScore(String score) {
            this.score = Integer.parseInt(score);
        }

        public void setPow(char pow) {
            if (pow == 'S') {
                this.pow = 1;
                return;
            }

            if (pow == 'D') {
                this.pow = 2;
                return;
            }

            this.pow = 3;
        }

        public void setEvent(String event) {
            this.event *= Integer.parseInt(event);
        }

        public double getResult() {
            return Math.pow(score, pow) * event;
        }
    }
}

