package com.LinkedList;

class Node {
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public String toString(){
            return String.format("%d\n", data);
        }

}

public class LinkedList {

    public Node head;

    public LinkedList(){
        head = null;
    }

    public void insert(int data){  // insert at head
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        }


    public void append(int data){  // insert at the end

       Node newNode = new Node(data);

       if(head == null){
           head = newNode;
       }else {
           Node temp = head;
           while (temp.next != null) {
               temp = temp.next;
           }
           temp.next = newNode;
       }
    }

    public void insertAtIndex(int index, int data){  // insert a node at an index
        if(index > length()){
            throw new ArithmeticException("The index is invalid");
        }
        else if(index == 0){
            insert(data);
        }else if(index == length()){
            append(data);
        }else{
            Node newNode = new Node(data);
            int steps = index;
            Node temp = head;
            while(steps > 1){
                temp = temp.next;
                steps -=1 ;
            }
            Node newNext = temp.next;
            newNode.next = newNext;
            temp.next = newNode;
        }
    }

    public int length(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
//    public Node search(int data){}
//
//    public boolean update(int oldData, int newData){}

//    public boolean delete(int data){}
//
    public String toString(){
        Node temp = head;
        String res = "";

        while (temp != null){
            res += String.format("%d->", temp.data);
            temp = temp.next;
        }

        res += String.format("null\n");
        return res;
    }

}

class Main{

    public static void main(String[] args){
        LinkedList lk = new LinkedList();
        lk.insert(0);
        lk.insert(1);
        lk.append(9);
        lk.insertAtIndex(2, 99);
        lk.insertAtIndex(4, 19);

        System.out.println(lk.length());
        System.out.println(lk);
    }
}
