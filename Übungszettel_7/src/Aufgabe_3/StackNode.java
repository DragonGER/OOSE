package Aufgabe_3;

public class StackNode<T> {
    private T content;
    private StackNode lowerNode;

    public StackNode(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public StackNode getLowerNode() {
        return lowerNode;
    }

    public void setLowerNode(StackNode lowerNode) {
        this.lowerNode = lowerNode;
    }
}
