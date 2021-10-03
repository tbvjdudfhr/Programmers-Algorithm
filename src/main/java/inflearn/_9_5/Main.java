package inflearn._9_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static int[] distances;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numberVertices = kb.nextInt() + 1;
        int numberEdges = kb.nextInt();
        distances = new int[numberVertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        ArrayList<ArrayList<Edge>> graph = new ArrayList(new ArrayList<Edge>());
        for (int i = 0; i < numberVertices; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < numberEdges; i++) {
            int current = kb.nextInt();
            int next = kb.nextInt();
            int cost = kb.nextInt();
            graph.get(current).add(new Edge(next, cost));
        }

        solution(graph);
        for (int i = 2; i < numberVertices; i++) {
            if (distances[i] != Integer.MAX_VALUE) System.out.println(i + " : " + distances[i]);
            else System.out.println(i + " : impossible");
        }
    }

    private static void solution(ArrayList<ArrayList<Edge>> graph) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(1, 0));

        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();
            ArrayList<Edge> edges = graph.get(currentEdge.vertex);
            if (currentEdge.cost > distances[currentEdge.vertex]) continue;
            for (Edge edge : edges) {
                int sumCost = edge.cost + currentEdge.cost;
                if (distances[edge.vertex] > sumCost) {
                    distances[edge.vertex] = sumCost;
                    priorityQueue.add(new Edge(edge.vertex, sumCost));
                }
            }
        }
    }

    private static class Edge implements Comparable<Edge> {
        int vertex;
        int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return o.cost - this.cost;
        }
    }
}
