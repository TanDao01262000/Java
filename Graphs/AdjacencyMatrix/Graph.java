package com.Graphs.AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> list;
    int [][] matrix;
    // constructor
    Graph(int size){
        list = new ArrayList<>();
        matrix = new int [size][size];
    }

    public void addNode(Node node){
        list.add(node);
    }

    public void addEdge(int src, int dst){
        matrix [src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst){
        if (matrix[src][dst] ==1) return true;
        return false;
    }

    public void print(){

        System.out.print("  ");
        for (Node node : list){
            System.out.print(node.data + " ");
        }
        System.out.println(" ");

        for (int i =0; i < matrix.length; i++ ){
            System.out.print(list.get(i).data +" ");
            for (int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println(" ");
        }

    }

    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);

    }

    private void dFSHelper(int src, boolean[] visited) {

        if (visited[src]){
            return;
        }else{
            visited[src] = true;
        }

        for (int i = 0; i < matrix[src].length; i++){
            if(matrix[src][i] == 1){
                dFSHelper(i, visited);
            }
        }
        return;
    }

    public void  breadthFirstSearch(int src){


    }

}
