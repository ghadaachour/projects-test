/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;

/**
 *
 * @author GHADA
 */
import java.util.ArrayDeque;
import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
public class DirectedGraph extends Graph{
    private List<List<Integer>> directedEdges;
    public DirectedGraph (){
    super();
     this.directedEdges = new ArrayList<>();}

    @Override
    public void addVertex(int vertex) {
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
    }

    @Override
    public void removeVertex(int vertex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeEdge(int vertex1, int vertex2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Integer> getNeighbors(int vertex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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
 // Dijkstra's Algorithm specific to Undirected Graph
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
}

