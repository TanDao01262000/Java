package com.DepthFirstSearch;

// DFS = a search algorithm for traversing a tree or graph
//    Step:
//    1. Pick a route
//    2. Keep going until we reach the end, or a previously visited node
//    3. Backtrack to the last node that has unvisited adjacent neighbors


// The file contains only the function, need to apply it to a graph to see how it actually works .


//    public void depthFirstSearch(int src){
//        boolean[] visited = new boolean[matrix.length];
//        dFSHelper(src, visited);
//        }
//
//    private void dFSHelper(int src, boolean[] visited) {
//
//        if (visited[src]){
//        return;

//        }else{
//        visited[src] = true;
//        }
//
//        for (int i = 0; i < matrix[src].length; i++){
//        if(matrix[src][i] == 1){
//        dFSHelper(i, visited);
//        }
//    }
//        return;
//}