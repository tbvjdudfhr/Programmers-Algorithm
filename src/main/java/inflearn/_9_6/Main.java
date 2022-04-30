package inflearn._9_6;

import java.util.Scanner;

public class Main {
    static int[] students;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int studentNumber = kb.nextInt();
        int numberPairs = kb.nextInt();
        students = new int[studentNumber + 1];
        for (int i = 1; i < studentNumber + 1; i++) {
            students[i] = i;
        }
        for (int i = 0; i < numberPairs; i++) {
            int first = kb.nextInt();
            int second = kb.nextInt();
            union(first, second);
        }

        int firstStudent = kb.nextInt();
        int secondStudent = kb.nextInt();
        System.out.println(solution(firstStudent, secondStudent));
    }

    public static String solution(int firstStudent, int secondStudent) {
        if (find(firstStudent) != find(secondStudent)) {
            return "NO";
        }

        return "YES";
    }

    public static void union(int first, int second) {
        students[find(first)] = find(second);
    }

    public static int find(int studentNumber) {
        if (students[studentNumber] == studentNumber) {
            return studentNumber;
        }
        else {
            students[studentNumber] = find(students[studentNumber]);
            return find(students[studentNumber]);
        }
    }

    static class Friend {
        int first;
        int second;

        private Friend(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public static Friend of (int first, int second) {
            return new Friend(first, second);
        }
    }
}
