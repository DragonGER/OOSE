package Aufgabe_3;

import java.util.LinkedList;

public class Baum<T> {
    public TNode<T> root;

    public Baum(TNode<T> node) {
        this.root = node;
    }

    public void printInOrder(TNode node) {
        if(node == null)
            return;
        printInOrder(node.getLNode());
        System.out.print(node.getContent() + " ");
        printInOrder(node.getRNode());
    }
    public void printPostOrder(TNode node) {
        if(node == null)
            return;
        printPostOrder(node.getLNode());
        printPostOrder(node.getRNode());
        System.out.print(node.getContent() + " ");
    }

    public void printPreOrder(TNode node) {
        if(node == null) return;

        System.out.print(node.getContent() + " ");
        printPreOrder(node.getLNode());
        printPreOrder(node.getRNode());
    }

    public void printLevelOrder(TNode node) {
        LinkedList<TNode> tNodeLinkedList = new LinkedList<TNode>();
        tNodeLinkedList.add(node);
        while(! tNodeLinkedList.isEmpty()) {
            TNode temp = tNodeLinkedList.poll();
            System.out.print(temp.getContent() + " ");
            if(temp.getLNode() != null) {
                tNodeLinkedList.add(temp.getLNode());
            }
            if(temp.getRNode() != null) {
                tNodeLinkedList.add(temp.getRNode());
            }
        }
    }
}
