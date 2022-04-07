package inflearn._6_7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        static Point of(int x, int y) {
            return new Point(x, y);
        }

        @Override
        public int compareTo(Point o) {
            if (this.x != o.x) return this.x - o.x;
            else return this.y - o.y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
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
        ;
        for (Point p : sortedList(points)) {
            System.out.println(p.x + " " + p.y);
        }
        return;
    }

    public static ArrayList<Point> sortedList(ArrayList<Point> points) {
        points.sort(Point::compareTo);

        return points;
    }
}
