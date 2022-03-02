package inflearn._2_3;


import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public String[] solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                .mapToObj(index -> getWinner(a[index], b[index]))
                .toArray(String[]::new);
    }

    private String getWinner(int a, int b) {
        if (a - b == 0) return "D";
        else if (a == 1 && b == 3) return "A";
        else if (a == 2 && b == 1) return "A";
        else if (a == 3 && b == 2) return "A";
        else return "B";
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
