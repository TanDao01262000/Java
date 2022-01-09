package com.Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> list ;

    Graph(){
        list = new ArrayList<>();
    }
    public void addNode(Node node){
        LinkedList<Node> list1 = new LinkedList<>();
        list1.add(node);
        list.add(list1);
    }

    public void addEdge(int src, int dst){
        Node node = new Node(list.get(dst).get(0).data);
        list.get(src).add(node);

    }

    // ridiculous incorrect one
    public boolean checkEdge(int src, int dst){
        LinkedList<Node> list2 = list.get(src);
        Node node1 = list.get(dst).get(0);
        for (Node node : list2) {

            if (node == node1){

                return true;
            }
        }
        return false;
    }
    public void print(){
        for (LinkedList<Node> ll : list){
            for (Node node : ll){
                System.out.print(node.data + " ->");
            }
            System.out.println();
        }
    }


}
