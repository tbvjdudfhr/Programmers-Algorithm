package inflearn._6_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x != o.x) return this.x - o.x;
            else return this.y - o.y;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] ints = new int[n];
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(new Point(kb.nextInt(), kb.nextInt()));
        }
        points.sort(Point::compareTo);
        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
        return;
    }
}