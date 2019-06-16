package Aufgabe_3;

public class Main {
    public static void main(String[] args) {
        var baum = new Baum<Integer>(new TNode<Integer>(20));
        baum.root.setLNode(new TNode<Integer>(5));
        baum.root.getLNode().setLNode(new TNode<Integer>(3));
        baum.root.getLNode().setRNode(new TNode<Integer>(7));
        baum.root.getLNode().getLNode().setLNode(new TNode<Integer>(4));
        baum.root.setRNode(new TNode<Integer>(12));
        baum.root.getRNode().setRNode(new TNode<Integer>(15));
        baum.root.getRNode().getRNode().setLNode(new TNode<Integer>(13));

        System.out.println("Preorder:");
        baum.printPreOrder(baum.root);
        System.out.println("");

        System.out.println("Postorder:");
        baum.printPostOrder(baum.root);
        System.out.println("");

        System.out.println("Inorder:");
        baum.printInOrder(baum.root);
        System.out.println("");

        System.out.println("Levelorder:");
        baum.printLevelOrder(baum.root);
        System.out.println("");
    }
}
