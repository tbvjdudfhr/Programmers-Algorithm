package kakao.keypad;

class Solution {
    Position left;
    Position right;

    public String solution(int[] numbers, String hand) {
        String answer = "";
        left = new Position(3, 0);
        right = new Position(3, 2);

        for (int number : numbers) {
            Position numberPosition = new Position((number - 1) / 3, (number - 1) % 3);
            if (number == 0) {
                numberPosition = new Position(3, 1);
            }

            String finger = numberPosition.getFinger(hand);

            answer += finger;

            if (numberPosition.isLeft(finger)) {
                left = numberPosition;
            } else {
                right = numberPosition;
            }
        }

        return answer;
    }

    class Position {
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }


        public String getFinger(String hand) {
            String finger = hand.equals("right") ? "R" : "L";

            if (col == 0) {
                finger = "L";
            } else if (col == 2) {
                finger = "R";
            } else {
                int leftDistance = left.getDistance(this);
                int rightDistance = right.getDistance(this);

                if (leftDistance < rightDistance) {
                    finger = "L";
                } else if (leftDistance > rightDistance) {
                    finger = "R";
                }
            }

            return finger;
        }

        private int getDistance(Position p) {
            return Math.abs(this.row - p.row) + Math.abs(this.col - p.col);
        }

        public boolean isLeft(String finger) {
            return finger.equals("L");
        }
    }
}
