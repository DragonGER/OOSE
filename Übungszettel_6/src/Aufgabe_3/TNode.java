package Aufgabe_3;

public class TNode<T> {
    private T content;
    private TNode<T> lNode;
    private TNode<T> rNode;

    public TNode(T value) {
        this.content = value;
    }

    public TNode() {
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public TNode<T> getLNode() {
        return lNode;
    }

    public void setLNode(TNode<T> lNode) {
        this.lNode = lNode;
    }

    public TNode<T> getRNode() {
        return rNode;
    }

    public void setRNode(TNode<T> rNode) {
        this.rNode = rNode;
    }
}
