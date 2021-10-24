package weekly._10weeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int minX = Integer.MAX_VALUE;
    public static int maxX = Integer.MIN_VALUE;
    public static int minY = Integer.MAX_VALUE;
    public static int maxY = Integer.MIN_VALUE;

    public String[] solution(int[][] line) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<line.length-1; i++) {
            for(int j=i+1; j<line.length; j++) {
                long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long denominator = (a * d) - (b * c);
                if(denominator == 0) continue;

                long numerator = (b * f) - (e * d);
                long numerator2 = (e * c) - (a * f);
                if(numerator % denominator != 0 || numerator2 % denominator != 0) continue;

                int x  = (int) (numerator / denominator);
                int y = (int) (numerator2 / denominator);

                List<Integer> temp = Arrays.asList((int) x, (int) y);
                if(!list.contains(temp)) list.add(temp);

                minX = Math.min(minX, (int) x);
                maxX = Math.max(maxX, (int) x);
                minY = Math.min(minY, (int) y);
                maxY = Math.max(maxY, (int) y);
            }
        }

        List<String> board = new ArrayList<>();
        for(int i=minY; i<=maxY; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=minX; j<=maxX; j++) {
                sb.append(".");
            }
            board.add(sb.toString());
        }

        for(List<Integer> intersection : list) {
            StringBuilder sb = new StringBuilder(board.get(Math.abs(intersection.get(1) - maxY)));
            sb.setCharAt(Math.abs(intersection.get(0) - minX), '*');
            board.set(Math.abs(intersection.get(1) - maxY), sb.toString());
        }

        String[] answer = new String[board.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = board.get(i);
        }

        return answer;
    }
}
