package com.BinarySearchTree;

class Node {

    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public String toString() {
        return String.format("%d", data);
    }
}


public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void nonRecursiveInsert(int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            while (true) {

                if (data > temp.data) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }

        }
    }

    public void recursiveInsert(Node current, int data) {

        if (current.data == data) {
            return;
        }

        if (current.data < data) {
            if (current.right != null) {
                recursiveInsert(current.right, data);
            } else {
                Node newNode = new Node(data);
                current.right = newNode;
            }
        } else {
            if (current.left != null) {
                recursiveInsert(current.left, data);
            } else {
                Node newNode = new Node(data);
                current.left = newNode;
            }
        }
    }

    public Node search(int data) {
        Node temp = root;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            } else if (temp.data > data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return null;
    }


        public Node getSuccessor(Node deleteNode){
            Node parentSuccessor = deleteNode;
            Node successor = deleteNode;
            Node current = deleteNode.right;

            // traverse all the way LEFT down
            while (current != null){
                parentSuccessor = successor;
                successor = current;
                current = current.left;
            }

            if ( successor != deleteNode.right){
                parentSuccessor.left = successor.right;
                successor.right = deleteNode.right;
                successor.left = deleteNode.left;
//                System.out.println("print right" + successor.right);
//                System.out.println("print left" + successor.left);
            }
            return successor;
        }

        public boolean remove(int data) {

            // check empty tree
            if (root == null){
                return false;
            }

            Node current = root;
            Node parent = root;
            boolean isLeft = true;

            // searching for the node
            while(current.data != data) {

                parent = current;
                if (current.data > data) {
                    isLeft = true;
                    current = current.left;

                } else {
                    isLeft = false;
                    current = current.right;
                }
            }

            // it's at the node to delete now.

            // case1: the node is a leaf
            if (current.left == null && current.right == null){

                // check if the node is root
                if (current == root){
                    root = null;
                }else {
                    if (isLeft) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            // case2: the node has one child
            }else if(current.right == null){
                if(isLeft){
                    parent.left = current.left;
                }else{
                    parent.right = current.left;
                }
            }else if(current.left == null){
                if(isLeft){
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }
            // case3: the node has two children
            else{
                Node successor = getSuccessor(current);
                if (parent == current){
                    root = successor;
                }else if (isLeft){
                    parent.left = successor;
                }else{
                    parent.right = successor;
                }
                successor.left = current.left;
            }

            return true;
        }
        public boolean update(int oldData, int newData){
            Node temp = search(oldData);
            if (temp == null){
                return false;
            }else{
                remove(oldData);
                nonRecursiveInsert(newData);
            }
            return true;
        }

    public void inorderTraverse(Node current) {
        if (current != null) {
            inorderTraverse(current.left);
            System.out.println(current);
            inorderTraverse(current.right);
        }
    }

    public void preorderTraverse(Node current) {
        if (current != null) {
            System.out.println(current);
            preorderTraverse(current.left);

            preorderTraverse(current.right);
        }
    }

    public void postorderTraverse(Node current) {
        if (current != null) {
            postorderTraverse(current.left);
            postorderTraverse(current.right);
            System.out.println(current);
        }
    }
}


class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.nonRecursiveInsert(10);
        tree.nonRecursiveInsert(3);
        tree.nonRecursiveInsert(15);
        tree.recursiveInsert(tree.root, 20);
        tree.nonRecursiveInsert(13);
        tree.nonRecursiveInsert(12);
        tree.nonRecursiveInsert(11);
        tree.nonRecursiveInsert(19);
        tree.nonRecursiveInsert(17);
        tree.nonRecursiveInsert(18);
        tree.inorderTraverse(tree.root);
        tree.update(15, 999);
        System.out.println("=+==========++===================");

        tree.preorderTraverse(tree.root);

    }
}