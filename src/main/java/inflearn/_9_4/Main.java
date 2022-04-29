package inflearn._9_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Lecture> lectures = new ArrayList<>();
        int maxDate = 0;
        for (int i = 0; i < n; i++) {
            int money = kb.nextInt();
            int date = kb.nextInt();
            lectures.add(new Lecture(money, date));
            maxDate = Math.max(date, maxDate);
        }

        System.out.println(solution(lectures, maxDate));
    }

    public static int solution(ArrayList<Lecture> lectures, int maxDate) {
        Collections.sort(lectures);
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int answer = 0;
        int j = 0;
        for (int i = maxDate; i > 0; i--) {
            for (; j < lectures.size(); j++) {
                Lecture lecture = lectures.get(j);
                if (lecture.date == i) integerPriorityQueue.add(lecture.money);
                else break;
            }

            if (!integerPriorityQueue.isEmpty()) answer += integerPriorityQueue.poll();
        }
        return answer;
    }

    public static class Lecture implements Comparable<Lecture> {
        int money;
        int date;

        private Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        public static Lecture of(int money, int date) {
            return new Lecture(money, date);
        }

        @Override
        public int compareTo(Lecture o) {
            if (this.date == o.date) return o.money - this.money;
            return o.date - this.date;
        }
    }
}
