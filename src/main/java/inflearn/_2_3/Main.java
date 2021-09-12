package inflearn._2_3;


import java.util.Scanner;

public class Main {
    public String[] solution(int[] a, int[] b) {
        String[] answer = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] - b[i] == 0) answer[i] = "D";
            else if (a[i] == 1 && b[i] == 3) answer[i] = "A";
            else if (a[i] == 2 && b[i] == 1) answer[i] = "A";
            else if (a[i] == 3 && b[i] == 2) answer[i] = "A";
            else answer[i] = "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main t = new Main();
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = kb.nextInt();
        }
        String[] strings = t.solution(a, b);
        for (String str : strings) {
            System.out.println(str);
        }
        return;
    }
}
