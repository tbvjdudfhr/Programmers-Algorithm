package cospro1.숫자뽑기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        Arrays.sort(arr);
        int answer = arr[arr.length - 1];
        for (int i = 0; i <= arr.length - K; i++) {
            answer = Math.min(answer, arr[K - 1 + i] - arr[i]);
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {9, 11, 9, 6, 4, 19};
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }
}