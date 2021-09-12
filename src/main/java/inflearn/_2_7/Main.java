package inflearn._2_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int tmp = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            if(x ==1) tmp += 1;
            else tmp = 0;
            result += tmp;
        }
        System.out.print(result);
        return;
    }
}
