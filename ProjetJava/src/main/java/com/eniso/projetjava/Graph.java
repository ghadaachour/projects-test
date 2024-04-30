/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;

/**
 *
 * @author GHADA
 */
import java.util.*;
 public abstract class Graph {
    private List<Integer> vertices;
    private Map<Integer, List<Integer>> edges;
     protected Map<Integer, List<Edge>> adjacencyList;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new HashMap<>();
        this.adjacencyList = new HashMap<>();
    }
    // Getters
    public List<Integer> getVertices() {
        return vertices;
    }

    public Map<Integer, List<Integer>> getEdges() {
        return edges;
    }

    // Setters
    public void setVertices(List<Integer> vertices) {
        this.vertices = vertices;
    }

    public void setEdges(Map<Integer, List<Integer>> edges) {
        this.edges = edges;
    }

    public abstract void addVertex(int vertex);

    public abstract void addEdge(int vertex1, int vertex2);

    public abstract void removeVertex(int vertex);

    public abstract void removeEdge(int vertex1, int vertex2);

    public abstract List<Integer> getNeighbors(int vertex);
     // Breadth-First Search (BFS) Algorithm
    public List<Integer> breadthFirstSearch(int source) {
        List<Integer> visited = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            List<Integer> neighbors = getNeighbors(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return visited;
    }
    // Depth-First Search (DFS) Algorithm
    public List<Integer> depthFirstSearch(int source) {
        List<Integer> visited = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(source);
        visited.add(source);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            List<Integer> neighbors = getNeighbors(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return visited;
}
    // Dijkstra's Algorithm
    public Map<Integer, Integer> dijkstraShortestPath(int source) {
        Map<Integer, Integer> distances = new HashMap<>();
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getValue));
        Set<Integer> visited = new HashSet<>();

        for (Integer vertex : adjacencyList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(source, 0);
        pq.offer(new Pair<>(source, 0));

        while (!pq.isEmpty()) {
            int currentVertex = pq.poll().getKey();
            if (visited.contains(currentVertex)) continue;

            visited.add(currentVertex);
            for (Edge edge : adjacencyList.get(currentVertex)) {
                int neighbor = edge.vertex;
                int weight = edge.weight;
                if (!visited.contains(neighbor) && distances.get(currentVertex) + weight < distances.get(neighbor)) {
                    distances.put(neighbor, distances.get(currentVertex) + weight);
                    pq.offer(new Pair<>(neighbor, distances.get(neighbor)));
                }
            }
        }

        return distances;
    }
    protected class Edge {
        int vertex;
        int weight;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
 }
