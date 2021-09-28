package inflearn._9_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = kb.nextInt();
            int endTime = kb.nextInt();
            meetings.add(new Meeting(startTime, endTime));
        }

        System.out.println(Solution(meetings));
    }

    private static int Solution(ArrayList<Meeting> meetings) {
        Collections.sort(meetings);
        int cnt = 0, minEndTime = 0;
        for (Meeting meeting : meetings) {
            if (minEndTime <= meeting.startTime) {
                cnt++;
                minEndTime = meeting.endTime;
            }
        }
        return cnt;
    }

    private static class Meeting implements Comparable<Meeting> {
        int startTime;
        int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.endTime == o.endTime) return this.startTime - o.startTime;
            return this.endTime - o.endTime;
        }
    }
}
