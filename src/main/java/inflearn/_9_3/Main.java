package inflearn._9_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Wedding> weddings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = kb.nextInt();
            weddings.add(new Wedding(startTime, 's'));
            int endTime = kb.nextInt();
            weddings.add(new Wedding(endTime, 'e'));
            treeSet.add(startTime);
            treeSet.add(endTime);
        }
        System.out.print(solution(weddings, treeSet));
        return;
    }

    private static int solution(ArrayList<Wedding> weddings, TreeSet<Integer> treeSet) {
        int answer = 0;
        int cnt = 0;
        Collections.sort(weddings);

        for (int t : treeSet) {
            for (Wedding w : weddings) {
                if (t == w.time) {
                    if (w.status == 's') cnt++;
                    else cnt--;
                }
            }
            answer = Math.max(cnt, answer);
        }

        return answer;
    }

    private static class Wedding implements Comparable<Wedding> {
        int time;
        char status;

        public Wedding(int time, char status) {
            this.time = time;
            this.status = status;
        }

        @Override
        public int compareTo(Wedding o) {
            if (this.time == o.time) return this.status - o.status;
            return this.time - o.time;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wedding wedding = (Wedding) o;
            return time == wedding.time && status == wedding.status;
        }

        @Override
        public int hashCode() {
            return Objects.hash(time, status);
        }
    }
}