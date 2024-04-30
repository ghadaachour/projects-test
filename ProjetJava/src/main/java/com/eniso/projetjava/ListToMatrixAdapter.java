/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;

/**
 *
 * @author GHADA
 */
import java.util.List;
public class ListToMatrixAdapter {
    public static int[][] convert(List<List<Integer>> adjacencyList, int numVertices) {
        int[][] adjacencyMatrix = new int[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjacencyMatrix[i][j] = adjacencyList.get(i).contains(j) ? 1 : 0;
            }
        }

        return adjacencyMatrix;
    }

    public static void addEdge(List<List<Integer>> adjacencyList, int vertex1, int vertex2) {
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public static void removeEdge(List<List<Integer>> adjacencyList, int vertex1, int vertex2) {
        adjacencyList.get(vertex1).remove(Integer.valueOf(vertex2));
        adjacencyList.get(vertex2).remove(Integer.valueOf(vertex1));
    
}}
