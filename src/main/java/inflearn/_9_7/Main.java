package inflearn._9_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static int[] parent ;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cityNumber = kb.nextInt();
        int roadNumber = kb.nextInt();
        parent  = new int[cityNumber + 1];

        for (int i = 1; i < cityNumber + 1; i++) {
            parent [i] = i;
        }
        ArrayList<Edge> edges = new ArrayList<>();
        for (int i = 0; i < roadNumber; i++) {
            int aCity = kb.nextInt();
            int bCity = kb.nextInt();
            int cost = kb.nextInt();
            edges.add(new Edge(aCity, bCity, cost));
        }

        System.out.println(solution(edges));
    }

    private static int solution(ArrayList<Edge> edges) {
        int answer = 0;
        Collections.sort(edges);
        for (Edge edge : edges) {
            if (find(edge.aCity) != find(edge.bCity)) {
                answer += edge.cost;
                union(edge.aCity, edge.bCity);
            }
        }
        return answer;
    }

    private static void union(int first, int second) {
        if(find(first) != find(second)) parent[find(first)] = find(second);
    }

    private static int find(int no) {
        if(no == parent[no]) return no;
        parent[no] = find(parent[no]);
        return find(parent[no]);
    }

    private static class Edge implements Comparable<Edge> {
        private int aCity;
        private int bCity;
        private int cost;

        public Edge(int aCity, int bCity, int cost) {
            this.aCity = aCity;
            this.bCity = bCity;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return aCity == edge.aCity && bCity == edge.bCity && cost == edge.cost;
        }

        @Override
        public int hashCode() {
            return Objects.hash(aCity, bCity, cost);
        }
    }
}
