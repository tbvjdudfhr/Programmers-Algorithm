package pccp._3.유전법칙;

public class Solution {
    public String[] solution(int[][] queries) {
        String[] answer;
        int generation;
        long number;

        answer = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            generation = queries[i][0];
            number = queries[i][1];

            answer[i] = solve(generation, number);
        }

        return answer;
    }

    static String solve(int generation, long number) {
        long upperCaseLastNum;
        long centerGroupLastNum;
        String strRoot = "Rr";
        long tempNum;

        if (generation == 1) {
            return strRoot;
        }

        upperCaseLastNum = (long) Math.pow(4, generation - 2);
        centerGroupLastNum = upperCaseLastNum + (2 * upperCaseLastNum);

        if (number <= upperCaseLastNum) {
            return "RR";
        } else if (upperCaseLastNum < number && number <= centerGroupLastNum) {
            tempNum = number % ((centerGroupLastNum - upperCaseLastNum) / 2) == 0 ?
                    (centerGroupLastNum - upperCaseLastNum) / 2 : number % ((centerGroupLastNum - upperCaseLastNum) / 2);
            return solve(generation - 1, tempNum);
        } else {
            return "rr";
        }
    }
}
