/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;

/**
 *
 * @author GHADA
 */
import java.util.ArrayList;
import java.util.List;
public class MatrixToListAdapter {
     public static List<List<Integer>> convert(int[][] adjacencyMatrix) {
        List<List<Integer>> adjacencyList = new ArrayList<>();

        int numVertices = adjacencyMatrix.length;
        for (int i = 0; i < numVertices; i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    neighbors.add(j);
                }
            }
            adjacencyList.add(neighbors);
        }

        return adjacencyList;
    }

    public static void addEdge(int[][] adjacencyMatrix, int vertex1, int vertex2) {
        adjacencyMatrix[vertex1][vertex2] = 1;
        adjacencyMatrix[vertex2][vertex1] = 1;
    }

    public static void removeEdge(int[][] adjacencyMatrix, int vertex1, int vertex2) {
        adjacencyMatrix[vertex1][vertex2] = 0;
        adjacencyMatrix[vertex2][vertex1] = 0;
    }
    
}
