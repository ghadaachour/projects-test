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
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Tree extends Graph {

    private int root;
    private List<Integer> parent;
    private List<List<Integer>> children;
    private List<Integer> depth;

    public Tree() {
        super();
        this.parent = new ArrayList<>();
        this.children = new ArrayList<>();
        this.depth = new ArrayList<>();
    }

    public int getRoot() {
        return root;
    }

    public void setRoot(int root) {
        this.root = root;
    }

    public List<Integer> getParent() {
        return parent;
    }

    public void setParent(List<Integer> parent) {
        this.parent = parent;
    }

    public List<List<Integer>> getChildren() {
        return children;
    }

    public void setChildren(List<List<Integer>> children) {
        this.children = children;
    }

    public List<Integer> getDepth() {
        return depth;
    }

    public void setDepth(List<Integer> depth) {
        this.depth = depth;
    }

    
    
    public void addChild(int parent, int child) {
        addVertex(parent);
        addVertex(child);
        this.parent.set(child, parent);
        this.children.get(parent).add(child);
    }

    public void setDepth(int vertex, int depth) {
        this.depth.set(vertex, depth);
    }
    
    @Override
    public void removeEdge(int vertex1, int vertex2) {
        // Since a tree does not have edges directly between vertices, removing an edge is not applicable.
    }

    @Override
    public List<Integer> getNeighbors(int vertex) {
        return children.get(vertex);
    }

    // Tree-specific BFS traversal method
    public List<Integer> breadthFirstTraversal() {
        return breadthFirstSearch(root);
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Tree-specific DFS traversal method
    public List<Integer> depthFirstTraversal() {
        return depthFirstSearch(root);
    }

    @Override
    public void removeVertex(int vertex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addVertex(int vertex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    