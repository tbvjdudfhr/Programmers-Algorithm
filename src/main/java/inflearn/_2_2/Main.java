package inflearn._2_2;



import java.util.Scanner;

public class Main {
    public String solution(int[] ints) {
        int cnt  = 0;
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if(i == 0)  {
                cnt++;
                max = ints[i];
            }
            else {
                if(max < ints[i])  {
                    cnt++;
                    max = ints[i];
                }
            }
        }
        return String.valueOf(cnt);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main t = new Main();
        int i = kb.nextInt();
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = kb.nextInt();
        }
        System.out.println(t.solution(ints));
        return;
    }
}
